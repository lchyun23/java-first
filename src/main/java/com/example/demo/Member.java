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

  // Getter 생성
  // @Getter, @Setter를 쓰면은 24~43 줄이 필요 없다.
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public String getEmail() {
    return email;
  }

  // Setter
  public void setName(String name) {
    this.name = name;
  }

  // 객체 내부에 있는 필드에 접근할 때는 get 필요 없다.
  // @toString으로 대체할 수 있다.
  public String toString() {
    return ("id: " + this.id + "name: " + this.name + "age: " + getAge() + "email: " + getEmail());
  }
}
