package com.JPA.Mapping.dto;

import com.JPA.Mapping.models.Product;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
public class UserProductDto {
    private String name;
    private String email;
    private String phone;
    private List<Product> productList;
}
