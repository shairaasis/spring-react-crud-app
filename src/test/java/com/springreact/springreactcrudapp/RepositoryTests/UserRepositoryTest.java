package com.springreact.springreactcrudapp.RepositoryTests;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.springreact.springreactcrudapp.model.User;
import com.springreact.springreactcrudapp.repository.UserRepository;

@DataJpaTest
public class UserRepositoryTest {
    
    @Autowired
    UserRepository userRepository;
    

    @Test
    void shouldCheckIfUserExistsEmail(){
        User user = new User();
        user.setId(null);
        user.setEmail("aa@gmail.com");
        user.setName("Aaa");
        user.setUsername("aaaa");

        userRepository.save(user);

        String email = "aa@gmail.com";
        boolean exists = userRepository.selectExistsEmail(email);


        assertThat(exists).isTrue();

    }   

    @Test
    void shouldCheckIfUserEmailDoesNotExist(){

        String email = "aa@gmail.com";
        boolean exists = userRepository.selectExistsEmail(email);


        assertThat(exists).isFalse();

    }   
}
