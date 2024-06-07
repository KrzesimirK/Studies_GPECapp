package com.example.GPECapp.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
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


//  PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//  private String password = passwordEncoder.encode(this.password);

//  PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//  String hashedPassword = passwordEncoder.encode(password);

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
  // Jak z oznaczaniem PrimaryKEY !!!!!!!!!! oraz ze ma zostać puste i baza sama nadpisze
  @Id
  @UniqueElements
  private long idAutoUser;

  public toUser(PasswordEncoder passwordEncoder) {
    return new User(
            login, passwordEncoder.encode(password),
            firstName, lastName, workerNumber, department, authorities, phoneNumber);
  }

}
