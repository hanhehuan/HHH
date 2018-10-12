package com.hhh.service;

import com.hhh.entity.User;
import com.hhh.repository.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;
    public User findByUsername(String name){
        User user=null;
        try {
            user=userRepositoty.findByUsername(name);
        }catch (Exception e){

        }
        return user;

    }

}
