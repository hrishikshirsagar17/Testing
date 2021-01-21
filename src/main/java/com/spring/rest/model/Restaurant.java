package com.spring.rest.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.Data;

@Entity
public @Data class Restaurant implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "Restaurant_Name")
  private String restName;

  @Lob
  @Column(name = "Address")
  private String address;

  @Column(name = "Phone_Number")
  private long phoneNo;

  private String openTime;

  private String closeTime;

  private boolean isActive;

  private String lastModifiedTime;



}
