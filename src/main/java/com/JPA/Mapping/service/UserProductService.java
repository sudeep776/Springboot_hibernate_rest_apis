package com.JPA.Mapping.service;

import com.JPA.Mapping.dto.UserProductDto;
import com.JPA.Mapping.models.Product;
import com.JPA.Mapping.models.User;

import java.util.List;

public interface UserProductService {
    public UserProductDto getUserProduct(UserProductDto userProductDtoList);
}
