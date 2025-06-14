package com.benson.sfmdemo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Entity
@Table(name = "Person")
@Data
public class Person {

  @Id private String username;

  private String firstName;

  private String lastName;

  private String email;

  @Column(length = 500)
  private String notes;
}
