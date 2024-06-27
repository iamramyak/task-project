package com.springboot.taskproject.service;

import com.springboot.taskproject.model.Users;
import com.springboot.taskproject.payload.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public UserDto createUser(UserDto userDto);

    public Optional<Users> getUser(int id);

    public List<Users> getAllUsers();
}