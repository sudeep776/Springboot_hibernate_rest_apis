package com.JPA.Mapping.dto;

import com.JPA.Mapping.models.Location;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Getter
public class UserLocationDto {
    private String name;
    private String email;
    private String phone;
    private List<Location> locationList;
}
