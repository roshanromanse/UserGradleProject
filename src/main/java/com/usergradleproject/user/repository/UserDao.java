package com.usergradleproject.user.repository;

import com.usergradleproject.user.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User getUser(String email, String password);
    User updateUser(int id, User user);
 /*   void deleteUser(int id);
    User saveUser(User user);*/
}
