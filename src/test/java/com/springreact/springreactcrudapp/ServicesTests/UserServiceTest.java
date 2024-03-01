package com.springreact.springreactcrudapp.ServicesTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.springreact.springreactcrudapp.model.User;
import com.springreact.springreactcrudapp.repository.UserRepository;
import com.springreact.springreactcrudapp.services.UserService;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    
    @Mock
    private UserRepository userRepository;
    private UserService userService;
    
    @BeforeEach
    void setup(){
        userService =  new UserService(userRepository);
    }

    

    @Test
    void canGetAllUsers(){
        userService.getAllUsers();
        verify(userRepository).findAll();
    }

    @Disabled
    @Test
    void canAddUser1(){
        User user = new User();
        user.setId(null);
        user.setEmail("aa@gmail.com");
        user.setName("Aaa");
        user.setUsername("aaaa");


        userService.addUser(user);
        verify(userRepository).save(user);
    }


    @SuppressWarnings("null")
    @Test
    void canAddUser(){
        User user = new User();
        user.setId(null);
        user.setEmail("aa@gmail.com");
        user.setName("Aaa");
        user.setUsername("aaaa");


        userService.addUser(user);
        ArgumentCaptor<User> studArgumentCaptor = ArgumentCaptor.forClass(User.class);


        verify(userRepository).save(studArgumentCaptor.capture());

        User capturedUser = studArgumentCaptor.getValue();
        System.out.println(capturedUser);
        assertThat(user).isEqualTo(capturedUser);
    }

    @SuppressWarnings("null")
    @Test
    void canDeleteUser(){
        User user = new User();
        user.setId((long) 42);
        user.setEmail("aa@gmail.com");
        user.setName("Aaa");
        user.setUsername("aaaa");

        userService.addUser(user);

        userService.deleteUser(user.getId());

        verify(userRepository).deleteById(user.getId());

    }


}
