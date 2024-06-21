package com.example.GPECapp.service;

import com.example.GPECapp.model.RegDHN;
import com.example.GPECapp.model.User;
import com.example.GPECapp.repository.HMRepository;
import com.example.GPECapp.repository.RegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmService {

    // uszkodzony czujnik temp - pobranie temp. sprawdzenie czy nie spada temp do -25C
    // temp CO poza normami - pobranie temp zadanej, pobranie temp realizowanej, sprawdzenie czy w ciągu 1 h 60% i 2h 60%
    // Temp CWU poza normami - pobranie temp zadanej, pobranie temp realizowanej, sprawdzenie czy w ciągu 1 h 60% i 2h 60%

    //SELECT * from regdhn where dataOdczytuReg between '2022-04-27' and '2022-04-28'

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






}
