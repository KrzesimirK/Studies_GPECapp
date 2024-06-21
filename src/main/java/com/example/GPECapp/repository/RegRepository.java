package com.example.GPECapp.repository;

import com.example.GPECapp.model.RegDHN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface RegRepository extends JpaRepository<RegDHN, Long> {

    RegDHN findByDataOdczytuRegBetween(Date dataStart, Date dataStop);// import java.sql.Date czy model?

}
