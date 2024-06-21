package com.example.GPECapp.service;

import com.example.GPECapp.model.RegDHN;
import com.example.GPECapp.model.User;
import com.example.GPECapp.repository.HMRepository;
import com.example.GPECapp.repository.RegRepository;
import jakarta.persistence.Transient;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Data
public class AlarmService {

    @Autowired
    private RegRepository regRepository;

  public List<RegDHN> findAlarmsCO(LocalDateTime dataStart, LocalDateTime dataStop){
      return regRepository.findByDataOdczytuRegBetween(dataStart, dataStop);
  }

    // uszkodzony czujnik temp - pobranie temp. sprawdzenie czy nie spada temp do -25C
    // temp CO poza normami - pobranie temp zadanej, pobranie temp realizowanej, sprawdzenie czy w ciągu 1 h 60% i 2h 60%
    // Temp CWU poza normami - pobranie temp zadanej, pobranie temp realizowanej, sprawdzenie czy w ciągu 1 h 60% i 2h 60%

    //SELECT * from regdhn where dataOdczytuReg between '2022-04-27' and '2022-04-28'


    //SELECT tZasZadanaAkt from regdhn where dataOdczytuReg between '2022-04-27' and '2022-04-28'
    //SELECT tZasCO from regdhn where dataOdczytuReg between '2022-04-27' and '2022-04-28'
    //SELECT tZadCWU from regdhn where dataOdczytuReg between '2022-04-27' and '2022-04-28'
    //SELECT tZasCWU from regdhn where dataOdczytuReg between '2022-04-27' and '2022-04-28'

    // SELECT * from regdhn where dataOdczytuReg between '2022-04-27' and '2022-04-28' and where


//    @Autowired
//    private RegRepository regRepository;
//
//    @Autowired
//    private HMRepository hmRepository;
//
//    // pobranie danych
//    public List<RegDHN> getTempCOzadana(Long tZasZadanaAkt){
//        return regRepository.findByDataOdczytuRegBetween();
//    }
//
//    public List<RegDHN> getTempCOrealizowana(Long tZasCO){
//        return regRepository.findByDataOdczytuRegBetween();
//    }




//    SELECT * from regdhn where ((tZasCO -tZasZadanaAkt) > 5 ) and dataOdczytuReg between '2022-01-26' and '2022-08-28'
//    SELECT COUNT(dataOdczytuReg) from regdhn where

//
//    zmienna
//while "i=2 i < lenght i++
//
//        if (i-(i-1) <16){
//        a++} else a=0
//
//            if(a>3){ zmienna = alarm / ostrzezenie + data}


}
