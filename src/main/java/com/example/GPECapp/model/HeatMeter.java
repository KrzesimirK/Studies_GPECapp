package com.example.GPECapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class HeatMeter {

    @Id
    private long idAutoHM;
    private long modul;
    private long identyfikator;
    private String lokalizacja;
    private String urzadzenie;
    private Date dataOdczytuHM;
    private float energia;
    private float przeplyw;
    private float tZasHM;
    private float tPowHM;
    private int nrKlienta;


}
