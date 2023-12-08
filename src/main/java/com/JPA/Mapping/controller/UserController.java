package com.JPA.Mapping.controller;

import com.JPA.Mapping.dto.UserLaptopDto;
import com.JPA.Mapping.dto.UserLocationDto;
import com.JPA.Mapping.dto.UserProductDto;
import com.JPA.Mapping.models.User;
import com.JPA.Mapping.service.UserLaptopService;
import com.JPA.Mapping.service.UserLocationService;
import com.JPA.Mapping.service.UserProductService;
import com.JPA.Mapping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserLaptopService userLaptopService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserProductService userProductService;
    @Autowired
    private UserLocationService userLocationService;

    @GetMapping("/getEmp")
    public ResponseEntity<List<User>> getEmployees(){
        return new ResponseEntity<>(userService.getUsers(),HttpStatus.OK);
    }

    @PostMapping("/saveEmp")
    public ResponseEntity<User> saveEmployees(@RequestBody UserLaptopDto userLaptopDto){
        return new ResponseEntity<User>(userLaptopService.saveUser(userLaptopDto), HttpStatus.CREATED);
    }

    @PostMapping("/saveEmpLoc")
    public ResponseEntity<User> saveEmpLocation(@RequestBody UserLocationDto userLocationDto){
        return new ResponseEntity<>(userLocationService.saveUser(userLocationDto),HttpStatus.CREATED);
    }

    @PostMapping("/saveEmpProd")
    public ResponseEntity<UserProductDto> saveEmpProduct(@RequestBody UserProductDto userProductDto){
        return new ResponseEntity<>(userProductService.getUserProduct(userProductDto),HttpStatus.CREATED);
    }
}
