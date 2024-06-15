package com.example.GPECapp.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
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
@Table(name = "user")
public class User{


  @Id
  @UniqueElements
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idAutoUser;

  @NotEmpty
  private String password;
  @NotEmpty
  private String firstName;
  @NotEmpty
  private String lastName;
  @NotNull
  @UniqueElements
  private int workerNumber;
  private String department;
  private int phoneNumber;
  @NotEmpty
  private String authorities;
  @NotEmpty
  @UniqueElements
  private String login;


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

}

