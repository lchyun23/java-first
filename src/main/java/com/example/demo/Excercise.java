package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Excercise {

  private Integer id;
  private String name;
  private String description;

  public Excercise(Integer id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }
}
