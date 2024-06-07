package com.example.GPECapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.Date;

@Entity
@Data
public class HeatMeter {

    @NotNull
    private int modul;
    @NotNull
    private int identyfikator;
    @NotEmpty
    private String lokalizacja;
    @NotEmpty
    private String urzadzenie;
    @NotEmpty
    private Date dataOdczytuHM;
    private double energia;
    private double przeplyw;
    private double tZasHM;
    private double tPowHM;
    @NotNull
    private int nrKlienta;

    @Id
    @NotNull
    @UniqueElements
    private long idAutoHM;

}
