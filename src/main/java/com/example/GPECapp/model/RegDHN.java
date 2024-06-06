package com.example.GPECapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class RegDHN {

    @Id
    private long idAutoReg;
    private long modul;
    private long identyfikator;
    private String lokalizacja;
    private Date dataOdczytuRed;
    private float tZwyl;
    private float histerezaTzalaczenia;
    private float tZReal;
    private float tZasZadanaAkt;
    private float TzasCO;
    private float kgTzew1;
    private float kgTzew2;
    private float kgTzew3;
    private float kgTzew4;
    private float kgTzew5;
    private float kgTCO1;
    private float kgTCO2;
    private float kgTCO3;
    private float kgTCO4;
    private float kgTCO5;
    private float minTzas;
    private float maksTzas;
    private byte trybPracyCO;
    private byte wysterowanieZaworuCO;
    private float tZadCWU;
    private float tZadCWUzredukowana;
    private float tZasCWU;
    private byte trybPracyCWU;
    private byte wysterowanieZaworuCWU;

}
