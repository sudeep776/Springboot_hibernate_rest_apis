package com.JPA.Mapping.service;

import com.JPA.Mapping.dto.UserLaptopDto;
import com.JPA.Mapping.models.User;

public interface UserLaptopService {
    //to get users and laptops
    //public UserLaptopDto getUsers();
    public User saveUser(UserLaptopDto userLaptopDto);
}
