package com.data.gradle_mysql_data_jpa_pro2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.data.gradle_mysql_data_jpa_pro2.controller.UserController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class GradleMysqlDataJpaPro2Application {

	@Autowired
	private UserController userController;

	public static void main(String[] args) {

		SpringApplication.run(GradleMysqlDataJpaPro2Application.class, args);
	}

	@PostConstruct
	public void init() {
	}

}
