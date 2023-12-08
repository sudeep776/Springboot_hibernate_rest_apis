package com.JPA.Mapping.service.serviceImpl;

import com.JPA.Mapping.dto.UserLocationDto;
import com.JPA.Mapping.models.Laptop;
import com.JPA.Mapping.models.Location;
import com.JPA.Mapping.models.User;
import com.JPA.Mapping.repository.UserRepository;
import com.JPA.Mapping.service.UserLocationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

@Service
public class UserLocationServiceImpl implements UserLocationService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(UserLocationDto userLocationDto) {
        User user1 = modelMapper.map(userLocationDto, User.class);
        //get location from userlocation dto
        List<Location> locationList= userLocationDto.getLocationList();
        //set locationlist in user
        user1.setLocation(locationList);
        //set user in location obj
        for(Location location:locationList){
            location.setUser(user1);
        }
        return userRepository.save(user1);
    }
}
