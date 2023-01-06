package com.user.service.Service;

import com.user.service.entities.User;

import java.util.List;

public interface UserService {
    //user operations

    //create
    User saveUser(User user);

    //get all
    List<User> getAllUser();

    //get single user
    User getUser(String userId);


}
