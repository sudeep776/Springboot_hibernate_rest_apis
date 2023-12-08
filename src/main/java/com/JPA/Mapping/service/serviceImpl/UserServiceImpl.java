package com.JPA.Mapping.service.serviceImpl;

import com.JPA.Mapping.models.User;
import com.JPA.Mapping.repository.UserRepository;
import com.JPA.Mapping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
