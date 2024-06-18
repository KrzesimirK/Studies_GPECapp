package com.example.GPECapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Data
@Table(name = "urzadzenia")
public class Urzadzenia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAutoU;
    @NotNull
    private int modul;
    @NotNull
    private int nrKlienta;
}
