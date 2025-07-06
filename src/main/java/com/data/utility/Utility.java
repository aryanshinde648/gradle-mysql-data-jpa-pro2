package com.data.utility;

import com.data.gradle_mysql_data_jpa_pro2.dto.UserDto;
import com.data.gradle_mysql_data_jpa_pro2.model.User;

public class Utility {
    
    public static UserDto userToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFname(user.getFname());
        userDto.setLname(user.getLname());
        userDto.setPhone(user.getPhone());
        userDto.setEmail(user.getEmail());
        userDto.setAddress(user.getAddress());
        return userDto;
    }

    public static User userDtoTouser(UserDto userDto) {
        User user = new User();
        user.setPhone(userDto.getPhone());
        user.setId(userDto.getId());
        user.setLname(userDto.getLname());
        user.setFname(userDto.getFname());
        user.setEmail(userDto.getEmail());
        user.setAddress(userDto.getAddress());
        return user;
    }
}
