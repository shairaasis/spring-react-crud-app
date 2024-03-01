package com.springreact.springreactcrudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.springreactcrudapp.exception.UserNotFoundException;
import com.springreact.springreactcrudapp.model.User;
import com.springreact.springreactcrudapp.repository.UserRepository;
import com.springreact.springreactcrudapp.services.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:3000")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

  
    @Autowired
    private UserService userService;

    
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    
    @PostMapping("/save")
    User newUser(@RequestBody User newUser){
        return userService.addUser(newUser);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        
        userService.deleteUser(id);
    }

    
    // this retrieves the user with parameter id in the request body
    @GetMapping("/user")
    User getUserById(@RequestParam("id") Long id) {
        return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }

    // does the same thing but with the id in the endpoint instead of the body
    @GetMapping("user/{id}")
    User getUserByIdWithoutRequestParam(@PathVariable("id") Long id) {
        return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }

    // @PostMapping("/save")
    // public void saveUser(@RequestBody User newUser) {

    //     userRepository.save(newUser);
    // }

    @PutMapping("/updateUser/{id}")
    User updateUser(@RequestBody User userUpdate, @PathVariable("id") Long id){

        return userRepository.findById(id).map(user -> {
            user.setUsername(userUpdate.getUsername());
            user.setName(userUpdate.getName());
            user.setEmail(userUpdate.getEmail());
            return userRepository.save(user);
        }).orElseThrow(()-> new UserNotFoundException(id));
        
    }

    // @PutMapping("/updateUser/{id}")
    // User updateUser(@RequestBody User updatedUser, @PathVariable("id") Long id) {
    //     Optional<User> optionalUser = userRepository.findById(id);
    //     if (optionalUser.isPresent()) {
    //         User user = optionalUser.get();
    //         String[] ignoreProperties = {"id"};
    //         try {
    //             // BeanUtils.copyProperties(user, updatedUser);
    //             BeanUtils.copyProperties(updatedUser, user, ignoreProperties);
    //         } catch (Exception e) {
    //             // Handle any exceptions that may occur during property copying
    //             e.printStackTrace();
    //         }

    //         userRepository.save(user); // Save the updated user to the repository
    //         return user; // Return the updated user
    //     } else {
    //         throw new UserNotFoundException(id);
    //     }
            
    //     // The following code works but null properties from the response body are also saved
    //     // return userRepository.findById(id).map(user -> {
    //     //     user.setUsername(updatedUser.getUsername());
    //     //     user.setName(updatedUser.getName());
    //     //     user.setEmail(updatedUser.getEmail());
    //     //     return userRepository.save(user);
    //     // }).orElseThrow(()-> new UserNotFoundException(id));
    // }

    
}
 