package com.usergradleproject.controller;

import com.usergradleproject.user.dto.User;
import com.usergradleproject.user.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserControl {
    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User fetchUser(@RequestParam String email, @RequestParam String password) {
        return (User) userDao.getUser(email, password);
    }


    //@RequestMapping(value = "/user", method = RequestMethod.POST)
    // public User insertUser(@RequestBody User user) {
    //   return userDao.saveUser(user);
    // }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public User putUser(@RequestParam Integer id, @RequestBody User user) {
        return userDao.updateUser(id, user);
    }

  /*   @DeleteMapping(value = "/user")
    public void removeUser(@RequestParam Integer id) {
        userDao.deleteUser(id);
        }*/
}
