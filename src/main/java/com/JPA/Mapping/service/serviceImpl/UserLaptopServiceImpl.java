package com.JPA.Mapping.service.serviceImpl;

import com.JPA.Mapping.dto.UserLaptopDto;
import com.JPA.Mapping.models.Laptop;
import com.JPA.Mapping.models.Location;
import com.JPA.Mapping.models.User;
import com.JPA.Mapping.repository.UserRepository;
import com.JPA.Mapping.service.UserLaptopService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLaptopServiceImpl implements UserLaptopService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;
//    @Override
//    public UserLaptopDto getUsers() {
//
//    }

    @Override
    public User saveUser(UserLaptopDto userLaptopDto) {
        User user1 = modelMapper.map(userLaptopDto, User.class);
        Laptop laptop1 = modelMapper.map(userLaptopDto,Laptop.class);
        user1.setLaptop(laptop1);
        laptop1.setUser(user1);
        return userRepository.save(user1);
    }
}
