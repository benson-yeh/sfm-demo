package com.benson.sfmdemo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
@Table(name = "LoginRecord")
public class LoginRecord {
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Id
  private Long id;

  private String username;
  private LocalDateTime loginTime;
}
