package com.example.demo;

/* 자바에서는 배열 요소의 값을 클래스 또는 메서드 안에서 초기화 해야 한다.
 * 생성자나 메서드 내부에서 배열의 필드를 선언하고 값을 할당할 수 있다.
 */
public class ArrayWeeks {

  String[] weeks;

  // 배열 값 할당하는 메서드
  public void initializeWeeks() {
    weeks = new String[7];
    weeks[0] = "월";
    weeks[1] = "화";
    weeks[2] = "수";
    weeks[3] = "목";
    weeks[4] = "금";
    weeks[5] = "토";
    weeks[6] = "일";
  }

  // 배열 값을 출력하는 메서드
  public void printWeeks() {
    for (String day : weeks) {
      System.out.println(day);
    }
  }
}
