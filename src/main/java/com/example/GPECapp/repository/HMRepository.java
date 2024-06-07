package com.example.GPECapp.repository;

import com.example.GPECapp.model.HeatMeter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Czemu nie mogę dodać więcej - np. dodatkowo po Stringu szukać?
// bo teraz jak znaleźć po String??

@Repository
public interface HMRepository extends JpaRepository<HeatMeter, Long> {
}
