package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {

  private Integer id;
  private String name;
  private Integer price;

  public Car(Integer id, String name, Integer price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }
}
