package com.example.GPECapp.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;


@Entity
@Data
@NoArgsConstructor
public class User{

  @NotEmpty
  private String password;
  @NotEmpty
  private String firstName;
  @NotEmpty
  private String lastName;
  @NotNull
  private int workerNumber;
  private String department;
  private int phoneNumber;
  @NotEmpty
  private String authorities;
  @NotEmpty
  @UniqueElements
  private String login;

  // czy jeżeli w bazie danych mam autoincrement - tu musze tez dodać te warunki??
  // typu not null / unique itp. czy baza sama mi wysypie że błędy
  // Jak z oznaczaniem PrimaryKEY !!!!!!!!!!
  @Id
  @UniqueElements
  @NotNull
  private long idAutoUser;

}
