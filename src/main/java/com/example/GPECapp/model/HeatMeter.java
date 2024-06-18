package com.example.GPECapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@Table(name = "heatmeter")
public class HeatMeter {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAutoHM;

    @NotNull
    private int modul;
    @NotNull
    private int identyfikator;
    @NotEmpty
    private String lokalizacja;
    @NotEmpty
    private String urzadzenie;
    @NotEmpty
    @DateTimeFormat
    private Date dataOdczytuHM;
    private double energia;
    private double przeplyw;
    private double tZasHM;
    private double tPowHM;
    @NotNull
    private int nrKlienta;


}
