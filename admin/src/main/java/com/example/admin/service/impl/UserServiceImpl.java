package com.example.admin.service.impl;

import com.example.admin.entity.Customer;
import com.example.admin.entity.User;
import com.example.admin.repository.UserRepository;
import com.example.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }

    @Override
    public Optional<User> findById(int id) {
        Optional<User> result = userRepository.findById(id);
        return result;
    }

    @Override
    public User saveOrUpdate(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public Boolean existsById(int id) {
        return userRepository.existsById(id);
    }


}
