package com.inspire12.homepage.service.user;

import com.inspire12.homepage.model.User;
import com.inspire12.homepage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public boolean createUser(User user){
        userRepository.save(user);
        return true;
    }

    public User findUser(String id){
        User user = userRepository.findByUserId(id);
        return user;
    }

    public List<User> listUp(){
        List<User> users = userRepository.findAll();
        return users;
    }
    
}