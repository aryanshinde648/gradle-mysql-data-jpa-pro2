package com.data.gradle_mysql_data_jpa_pro2.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.gradle_mysql_data_jpa_pro2.dto.UserDto;
import com.data.gradle_mysql_data_jpa_pro2.model.User;
import com.data.gradle_mysql_data_jpa_pro2.repository.UserRepository;
import com.data.utility.Utility;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private User user;

    public UserDto saveUser(UserDto userDto) {
        return Utility.userToUserDto(userRepo.save(Utility.userDtoTouser(userDto)));
    }

    public List<UserDto> fetchUserList() {
        return userRepo.findAll().stream().map(Utility::userToUserDto).toList();
    }

    public UserDto updateUser(UserDto userDto) {
        return Utility.userToUserDto(userRepo.saveAndFlush(Utility.userDtoTouser(userDto)));
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }

    public UserDto updatePartialUser(Integer id,UserDto partialUser){
        user = userRepo.findById(id).orElse(null);
        UserDto exUser = Utility.userToUserDto(user);
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

    public UserDto getUserById(Integer id){
        user = userRepo.findById(id).get();
        return Utility.userToUserDto(user);
    }

}
