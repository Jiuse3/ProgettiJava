package com.youssoufaseydi.PROG6.PROG6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youssoufaseydi.PROG6.PROG6.entities.Role;



@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {

}
