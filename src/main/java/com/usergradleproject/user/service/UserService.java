package com.usergradleproject.user.service;

import com.usergradleproject.user.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    User getUser(String email, String password);
    User updateUser(int id, User user);

    /*void deleteUser(int id);
    User saveUser(User user);*/
}

