package com.example.GPECapp.repository;

import com.example.GPECapp.model.HeatMeter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HMRepository extends JpaRepository<HeatMeter, Long> {
}
