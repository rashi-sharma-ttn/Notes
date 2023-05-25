package com.user.user_service.controller;

import com.user.user_service.entity.User;
import com.user.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/add-user")
    public ResponseEntity<?> addUser(@RequestBody User user){
        userService.addUser(user);
      return new ResponseEntity<>("User added", HttpStatus.OK);
    }

    @GetMapping("/get-user")
    public List<?> getUser(){
     return userService.getUser();
    }
}
