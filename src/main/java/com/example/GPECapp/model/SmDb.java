package com.example.GPECapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
    @UniqueElements
    private long idAutoSM;

    @NotEmpty
    @UniqueElements
    private String nameSM;
    @NotNull
    @UniqueElements
    @OneToMany
    private int nrKlienta;

}
