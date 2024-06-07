package com.example.GPECapp.repository;

import com.example.GPECapp.model.SMieszkaniowa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SMRepository extends CrudRepository<SMieszkaniowa, Long> {
}
