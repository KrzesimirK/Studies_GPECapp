package com.example.GPECapp.repository;

import com.example.GPECapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// nie JPA a CRUD - czy wystarczy sam CRUD, JPA ma więcej metod??
@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
