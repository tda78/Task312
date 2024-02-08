package com.example.task312.service;

import com.example.task312.dao.UserDao;
import com.example.task312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiseImpl implements UserService {


    private UserDao dao;

    public UserServiseImpl() {
    }

    @Autowired
    public UserServiseImpl(UserDao dao) {
        this.dao = dao;
    }


    @Override
    public List<User> getAllUsers() {
        return (List<User>) dao.findAll();
    }

    @Override
    public User getUser(Long id) {
        return (User) dao.findById(id).get();
    }


    @Transactional
    @Override
    public void saveUser(User user) {
        dao.save(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        dao.save(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        dao.deleteById(id);
    }
}
