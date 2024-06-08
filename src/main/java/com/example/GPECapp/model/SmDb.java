package com.example.GPECapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Data
public class SM_DB {

    @Id
    @NotNull
    @UniqueElements
    private long idAutoSM;
    @NotEmpty
    @UniqueElements
    private String nameSM;
    @NotNull
    @UniqueElements
    private int nrKlienta;

}
