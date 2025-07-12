package com.data.gradle_mysql_data_jpa_pro2.service;

import java.util.List;

import com.data.gradle_mysql_data_jpa_pro2.dto.UserDto;
import com.data.gradle_mysql_data_jpa_pro2.exception.CustomException;

public interface UserService {

    UserDto saveUser(UserDto userDto);

    List<UserDto> fetchUserList();

    UserDto updateUser(UserDto userDto);

    void deleteUser(Integer id);

    UserDto updatePartialUser(Integer id,UserDto partialUser) throws CustomException ;

    UserDto getUserById(Integer id);

    UserDto getUserByEmail(String email) throws CustomException;
}
