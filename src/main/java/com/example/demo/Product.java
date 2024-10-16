package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {

  private Integer id;
  private String name;
  private Double price;
  private String description;

  public Product(Integer id, String name, Double price, String description) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.description = description;
  }
  /* 여기서 this는 무엇인가?
   * 원래 내가 설정한 변수인가? = 자기 자신의 변수.
   * 매개변수로 받은 name을 나의 멤버변수 name에다가 넣을 때 사용.
   */
}
