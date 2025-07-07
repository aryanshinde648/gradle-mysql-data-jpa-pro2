package com.data.gradle_mysql_data_jpa_pro2.service;

import java.util.List;

import com.data.gradle_mysql_data_jpa_pro2.dto.UserDto;

public interface UserService {

    public UserDto saveUser(UserDto userDto);

    public List<UserDto> fetchUserList();

    public UserDto updateUser(UserDto userDto);

    public void deleteUser(Integer id);

    public UserDto updatePartialUser(Integer id,UserDto partialUser);

    public UserDto getUserById(Integer id);
    
}
