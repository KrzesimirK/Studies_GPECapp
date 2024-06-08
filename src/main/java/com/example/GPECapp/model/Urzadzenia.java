package com.example.GPECapp.model;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.UniqueElements;

public class Urzadzenia {

    @Id
    @UniqueElements
    private long idAutoU;
    @NotNull
    private int modul;
    @NotNull
    @ManyToOne
    private int nrKlienta;


}
