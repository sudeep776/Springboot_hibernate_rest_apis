package com.JPA.Mapping.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "location")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Street;
    private String city;
    private String zipCode;
    private static final String country = "India";
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="user_id")
    private User user;
}
