package com.data.gradle_mysql_data_jpa_pro2.repository;

import com.data.gradle_mysql_data_jpa_pro2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User getByEmail(String email);
}
