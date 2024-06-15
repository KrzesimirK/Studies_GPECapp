package com.example.GPECapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Data
@Table(name = "urzadzenia")
public class Urzadzenia {

    @Id
    @UniqueElements
    private long idAutoU;
    @NotNull
    private int modul;
    @NotNull
    private int nrKlienta;
}
