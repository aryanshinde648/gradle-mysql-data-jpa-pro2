package com.data.gradle_mysql_data_jpa_pro2.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.gradle_mysql_data_jpa_pro2.dto.UserDto;
import com.data.gradle_mysql_data_jpa_pro2.mapper.UserConversion;
import com.data.gradle_mysql_data_jpa_pro2.model.User;
import com.data.gradle_mysql_data_jpa_pro2.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    private User user;

    @Autowired
    private UserConversion userConversion;

    @Override
    public UserDto saveUser(UserDto userDto) {
        return userConversion.userToUserDto(userRepo.save(userConversion.userDtoTouser(userDto)));
    }

    @Override
    public List<UserDto> fetchUserList() {
        return userRepo.findAll().stream().map(userConversion::userToUserDto).toList();
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return userConversion.userToUserDto(userRepo.saveAndFlush(userConversion.userDtoTouser(userDto)));
    }

    @Override
    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserDto updatePartialUser(Integer id,UserDto partialUser) {
        user = userRepo.findById(id).orElse(null);
        UserDto exUser = userConversion.userToUserDto(user);
        if (exUser != null) {
        
            if(partialUser.getFname() != null){
                exUser.setFname(partialUser.getFname());
            }
            if (partialUser.getLname() != null) {
                exUser.setLname(partialUser.getLname());
            }
            if (partialUser.getPhone() != null) {
                exUser.setPhone(partialUser.getPhone());
            }
            if (partialUser.getEmail() != null) {
                exUser.setEmail(partialUser.getEmail());
            }
            if (partialUser.getAddress() != null) {
                exUser.setAddress(partialUser.getAddress());
            }
         
            return saveUser(exUser);
        }
        return null;
    }

    @Override
    public UserDto getUserById(Integer id) {
        user = userRepo.findById(id).get();
        return userConversion.userToUserDto(user);
    }

}
