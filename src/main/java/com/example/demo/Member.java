package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// 클래스와 필드 단위로 lombok 설정 가능하다.
public class Member {

  private Integer id;
  private String name;
  private Integer age;
  private String email;

  public Member(Integer id, String name, Integer age, String email) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email = email;
  }
}
