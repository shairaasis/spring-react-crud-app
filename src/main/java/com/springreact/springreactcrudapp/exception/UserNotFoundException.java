package com.springreact.springreactcrudapp.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("No user found with id: " + id);
    }
}
