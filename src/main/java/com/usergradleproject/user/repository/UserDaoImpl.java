package com.usergradleproject.user.repository;

import com.usergradleproject.HibernateConfiguration;
import com.usergradleproject.user.dto.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class UserDaoImpl implements UserDao{
    HibernateConfiguration hibernateConfig= new HibernateConfiguration();
    private SessionFactory sessionFactory = (SessionFactory) hibernateConfig.sessionFactory();
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    private Session session = this.sessionFactory.getCurrentSession();
    @Override
    public User getUser(String email, String password) {
        session.persist(email,password);
        return (User) session;
    }

    @Override
    public User updateUser(int id, User user) {
        session.update(String.valueOf(id),user);
        return null;
    }
/*
    @Override
    public void deleteUser(int id) {

    }

    @Override
    public User saveUser(User user) {
        return null;
    }*/
}
