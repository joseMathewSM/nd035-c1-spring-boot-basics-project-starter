package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.mapper.UserMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public boolean isUsernameAvailable(String username) {
        return userMapper.getUser(username) == null;
    }

    public int createUser(User user) {
        return userMapper.insert(user);
    }

    public boolean authenticateUser(User user) {
        User dbUser = userMapper.getUser(user.getUsername());
        boolean validUser = false;

        if(dbUser!=null){
            if(user.getPassword().equals(dbUser.getPassword())){
                validUser = true;
            }
        }

        return validUser;
    }
}
