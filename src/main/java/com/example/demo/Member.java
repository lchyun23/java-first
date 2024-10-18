package com.example.demo;

import lombok.Getter;

import javax.swing.text.html.parser.TagElement;

// 클래스 내부의 필드에 접근제어자는 항상 필수로 적어줘야 한다.
// 생성자는 public으로 해야 외부에서 호출 가능하다.

// 필드 4개 : id, name, age, email + 생성자

public class Member {
    private int id;
    private String name;
    private int age;
    private String email;

    // 생성자
    public Member(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
