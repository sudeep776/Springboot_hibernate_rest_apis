package com.JPA.Mapping;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;



@SpringBootApplication
public class MappingApplication {
	Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(MappingApplication.class, args);

	}
}

