package com.youssoufaseydi.PROG6.PROG6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youssoufaseydi.PROG6.PROG6.entities.User;



@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
