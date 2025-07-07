package com.data.gradle_mysql_data_jpa_pro2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.data.gradle_mysql_data_jpa_pro2.dto.UserDto;
import com.data.gradle_mysql_data_jpa_pro2.service.UserService;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<UserDto>> getUser() {
        return ResponseEntity.ok(userService.fetchUserList());
    }

    @GetMapping("/getnamebyid")
    public ResponseEntity<String> getNameById(@RequestHeader("id") Integer id){
        UserDto user = userService.getUserById(id);
        String name = user.getFname() + " " + user.getLname();
        return ResponseEntity.ok(name);
    }

    @PostMapping("/save")
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }
    
    @PutMapping("/update")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto user) {
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @PatchMapping("/updatepartial")
    public ResponseEntity<UserDto> updatePartialUser(@RequestHeader("id") Integer id,@RequestBody UserDto partialUser) {
        return ResponseEntity.ok(userService.updatePartialUser(id, partialUser));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteUser(@RequestHeader("id") Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/ex")
    public ResponseEntity<String> throwsexception() {
        String str = "123.45";
        int n = Integer.parseInt(str);
        return ResponseEntity.ok().build();
    }
    
}
