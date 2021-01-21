package com.spring.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "image_table")
public @Data class ImageModel {

  public ImageModel() {
    super();
  }

  public ImageModel(String name, String type, byte[] picByte) {
    this.name = name;
    this.type = type;
    this.picByte = picByte;
  }

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "type")
  private String type;

  @Lob
  private byte[] picByte;


}
