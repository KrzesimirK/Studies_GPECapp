package com.example.GPECapp.repository;

import com.example.GPECapp.model.Urzadzenia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrzadzeniaRepository extends JpaRepository<Urzadzenia, Long> {
}
