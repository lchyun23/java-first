package com.example.demo;

public class Member {

  // 필드는 private으로 감싸기
  private Integer id;
  private String name;
  private Integer age;
  private String email;

  // 생성자
  public Member(Integer id, String name, Integer age, String email) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email = email;
  }

  // Getter 메서드들
  public Integer getId() {
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

  // Setter 메서드들
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
