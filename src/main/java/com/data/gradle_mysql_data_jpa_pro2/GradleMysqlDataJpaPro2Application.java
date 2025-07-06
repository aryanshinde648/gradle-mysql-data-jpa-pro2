package com.data.gradle_mysql_data_jpa_pro2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class GradleMysqlDataJpaPro2Application {


	public static void main(String[] args) {

		SpringApplication.run(GradleMysqlDataJpaPro2Application.class, args);
	}

	@PostConstruct
	public void init() {
		
	}

}
