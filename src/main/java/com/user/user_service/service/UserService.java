package com.user.user_service.service;

import com.user.user_service.entity.User;
import com.user.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(User user) {
        user.setUserId(user.getUserId());
        user.setName(user.getName());
        user.setPhoneNo(user.getPhoneNo());
        userRepository.save(user);
    }

    public List<User> getUser() {
        return this.userRepository.findAll();
    }
}
