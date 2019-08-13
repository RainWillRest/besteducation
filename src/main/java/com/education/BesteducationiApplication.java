package com.education;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.education.dao")
public class BesteducationiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BesteducationiApplication.class, args);
	}

}
