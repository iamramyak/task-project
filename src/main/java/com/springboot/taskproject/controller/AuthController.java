package com.springboot.taskproject.controller;

import com.springboot.taskproject.model.Users;
import com.springboot.taskproject.payload.UserDto;
import com.springboot.taskproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto111111){
       return new ResponseEntity<>(userService.createUser(userDto111111), HttpStatus.CREATED);

    }
    @GetMapping("/user/{id}")
    public ResponseEntity<Optional <Users>> getUser(@PathVariable("id") int id ){
        return new ResponseEntity<>(userService.getUser(id),HttpStatus.OK);
    }
   @GetMapping("/getAllUsers")
    public ResponseEntity<List<Users>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);

   }
}
