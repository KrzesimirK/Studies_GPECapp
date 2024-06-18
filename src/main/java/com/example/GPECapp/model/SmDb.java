package com.example.GPECapp.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Data
@Table(name = "smdb")
public class SmDb {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAutoSM;

    @NotEmpty
    @Column(name = "nameSM",nullable = false, unique = true)
    private String nameSM;
    @NotNull
    @Column(name = "nrKlienta",nullable = false, unique = true)
    private int nrKlienta;

}
