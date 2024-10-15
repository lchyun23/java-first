package com.example.demo;

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
}
