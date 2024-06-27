package com.springboot.taskproject.serviceImpl;

import com.springboot.taskproject.model.Users;

import com.springboot.taskproject.payload.UserDto;
import com.springboot.taskproject.repository.UserRepository;
import com.springboot.taskproject.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto){
        Users user= userDtoToEntity(userDto);
        Users savedUser= userRepository.save(user);
        return entityToUserDto(savedUser);
    }
    private Users userDtoToEntity(UserDto userDto){
        Users users= new Users();
        users.setName(userDto.getName());
        users.setEmail(userDto.getEmail());
        users.setPassword(userDto.getPassword());
        return users;
    }
    private UserDto entityToUserDto(Users savedUser){
      UserDto userDto= new UserDto();
      userDto.setId(savedUser.getId());
      userDto.setName(savedUser.getName());
      userDto.setEmail(savedUser.getEmail());
      userDto.setPassword(savedUser.getPassword());
      return userDto;
    }

}
