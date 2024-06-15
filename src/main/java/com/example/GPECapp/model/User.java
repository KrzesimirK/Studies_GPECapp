package com.example.GPECapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;


@Entity
@Data
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
  private String roles;
  @NotEmpty
  @UniqueElements
  private String login;

public User(){
}

  public User (String password, String firstName, String lastName, int workerNumber,
               String department, int phoneNumber, String roles, String login){
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.workerNumber = workerNumber;
    this.department = department;
    this.phoneNumber = phoneNumber;
    this.roles = roles;
    this.login = login;
  }

}

