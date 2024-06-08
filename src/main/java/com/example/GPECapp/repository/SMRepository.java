package com.example.GPECapp.repository;

import com.example.GPECapp.model.SmDb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SMRepository extends CrudRepository<SmDb, Long> {
}
