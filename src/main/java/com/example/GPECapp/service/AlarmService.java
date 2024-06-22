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

    public List<RegDHN> getAllData() {
        return regRepository.findAll();
    }




}
