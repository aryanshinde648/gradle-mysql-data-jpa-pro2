package com.data.gradle_mysql_data_jpa_pro2.mapper;

import org.mapstruct.Mapper;

import com.data.gradle_mysql_data_jpa_pro2.dto.UserDto;
import com.data.gradle_mysql_data_jpa_pro2.model.User;

@Mapper(componentModel = "spring")
public interface UserConversion {
    UserDto userToUserDto(User user);
    
    User userDtoTouser(UserDto userDto);
}
