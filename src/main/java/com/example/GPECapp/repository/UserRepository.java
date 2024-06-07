package com.example.GPECapp.repository;

import com.example.GPECapp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> { // nie JPA a CRUD - wystarczy sam CRUD, JPA ma więcej metod
}
