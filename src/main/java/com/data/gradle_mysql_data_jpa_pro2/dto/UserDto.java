package com.data.gradle_mysql_data_jpa_pro2.dto;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    private Integer id;
    private String fname;
    private String lname;
    private String phone;
    private String email;
    private String address;
    
}
