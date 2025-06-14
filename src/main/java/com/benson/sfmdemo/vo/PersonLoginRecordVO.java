package com.benson.sfmdemo.vo;


import lombok.Data;

@Data
public class PersonLoginRecordVO {
  private String username;
  private String loginTime;
  private String firstName;
  private String lastName;
  private String email;
}
