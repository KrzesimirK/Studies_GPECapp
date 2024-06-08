package com.example.GPECapp.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Entity
@Data
@NoArgsConstructor
public class User{

  //!!!! Tu trzeba zastosować paswordEncoder na passwpor
  // Czy to może powinna być metoda CONTROLERA?? - ale jak by to wtedy miało działąć

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
  @Id
  @UniqueElements
  private long idAutoUser;

  public User (String password, String firstName, String lastName, int workerNumber,
  String department, int phoneNumber, String authorities, String login){
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.workerNumber = workerNumber;
    this.department = department;
    this.phoneNumber = phoneNumber;
    this.authorities=authorities;
    this.login = login;
  }

  // czy jeżeli w bazie danych mam autoincrement - tu musze tez dodać te warunki??
  // typu not null / unique itp. czy baza sama mi wysypie że błędy
  // Jak z oznaczaniem PrimaryKEY do dodatkowych zmiennych !!!!!!!!!! czy ma zostać puste i baza sama nadpisze



}

