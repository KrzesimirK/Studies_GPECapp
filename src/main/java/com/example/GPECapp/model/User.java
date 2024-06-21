package com.example.GPECapp.model;

import jakarta.annotation.security.RolesAllowed;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Value;
import org.hibernate.validator.constraints.UniqueElements;


@Entity
@Data
@Table(name = "user")
public class User{


  @NotEmpty (message = "Pole nie może być puste")
  private String password;
  @NotEmpty (message = "Prosze podać imię")
  private String firstName;
  @NotEmpty (message = "Prosze podać nazwisko")
  private String lastName;
  @NotNull (message= "Pole nie może być puste / musi być unikatowe")
  @Column(name = "workerNumber",nullable = false, unique = true)
  private int workerNumber;
  private String department;
  private int phoneNumber;
  @NotEmpty
  @Pattern(regexp = "USER|ADMIN", message = "Użytkownik musi mieć nadane uprawnienia: USER   lub   ADMIN")
  private String roles;
  @NotEmpty(message = "Pole nie może być puste / musi być unikatowe")
  @Size(min = 3, max = 30, message = "Login musi mieć od 3 do 30 znaków")
  @Column(name = "login",nullable = false, unique = true)
  private String login;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idAutoUser;


public User(){
}


  public User (String password, String firstName, String lastName, int workerNumber,
               String department, int phoneNumber, String roles, String login, long idAutoUser){
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.workerNumber = workerNumber;
    this.department = department;
    this.phoneNumber = phoneNumber;
    this.roles = roles;
    this.login = login;
    this.idAutoUser = idAutoUser;
  }


  @Transient
  private String confirmPassword;

}

