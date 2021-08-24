
package com.usergradleproject.user.service;

import com.usergradleproject.user.dto.User;
import com.usergradleproject.user.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserRepositoryInterface(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    @Transactional
    public User getUser(String email, String password) {
        return this.userDao.getUser(email, password);
    }

    @Override
    @Transactional
    public User updateUser(int id, User user) {
        return this.userDao.updateUser(id,user);
    }
/*
        @Override
        public void deleteUser(int id) {
            repository.findById(id).orElseThrow(UserNotFoundException::new);
            repository.deleteById(id);
        }

        @Override
        public User saveUser(User user) {
            repository.save(user);
            return user;
        }*/
}


