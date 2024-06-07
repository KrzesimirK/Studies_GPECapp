package com.example.GPECapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
public class RegDHN {

    @NotEmpty
    private int modul;
    @NotEmpty
    private int identyfikator;
    @NotEmpty
    private String lokalizacja;
    @NotEmpty
    private Date dataOdczytuReg;
    private double tZWyl;
    private double histerezaTzalaczenia;
    private double tZReal;
    private double tZasZadanaAkt;
    private double TzasCO;
    private double kgTzew1;
    private double kgTCO1;
    private double kgTzew2;
    private double kgTCO2;
    private double kgTzew3;
    private double kgTCO3;
    private double kgTzew4;
    private double kgTCO4;
    private double kgTzew5;
    private double kgTCO5;
    private double minTzas;
    private double maksTzas;
    private byte trybPracyCO;
    private byte wysterowanieZaworuCO;
    private double tZadCWU;
    private double tZadCWUzredukowana;
    private double tZasCWU;
    private byte trybPracyCWU;
    private byte wysterowanieZaworuCWU;

    @Id
    @NotNull
    @UniqueElements
    private long idAutoReg;

}
