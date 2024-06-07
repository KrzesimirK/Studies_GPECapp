package com.example.GPECapp.repository;

import com.example.GPECapp.model.RegDHN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegRepository extends JpaRepository<RegDHN, Long> {
}
