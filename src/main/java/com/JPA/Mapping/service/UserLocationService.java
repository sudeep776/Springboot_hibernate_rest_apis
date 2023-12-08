package com.JPA.Mapping.service;

import com.JPA.Mapping.dto.UserLocationDto;
import com.JPA.Mapping.models.User;
import lombok.Data;


public interface UserLocationService {
    public User saveUser(UserLocationDto userLocationDto);
}
