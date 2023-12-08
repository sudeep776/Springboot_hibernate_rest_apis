package com.JPA.Mapping.service.serviceImpl;

import com.JPA.Mapping.dto.UserProductDto;
import com.JPA.Mapping.models.Product;
import com.JPA.Mapping.models.User;
import com.JPA.Mapping.repository.ProductRepository;
import com.JPA.Mapping.repository.UserRepository;
import com.JPA.Mapping.service.UserProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserProductServiceImpl implements UserProductService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public UserProductDto getUserProduct(UserProductDto userProductDto) {
        User user = modelMapper.map(userProductDto,User.class);
        List<Product> ProductList = userProductDto.getProductList();
        user.setProduct(ProductList);
        for(Product product:ProductList){
           product.setUser(List.of(user));
        }
         User user1 = userRepository.save(user);
        UserProductDto userProductDto1 = modelMapper.map(user1,UserProductDto.class);
        return userProductDto1;
    }
}
