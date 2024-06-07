package com.example.GPECapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SMieszkaniowa {

    @Id
    private long idAutoSM;
    private String nameSM;
    private int nrKlienta;

}
