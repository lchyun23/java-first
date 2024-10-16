package com.example.demo;

/* 자바에서는 배열 요소의 값을 클래스 또는 메서드 안에서 초기화 해야 한다.
 * 생성자나 메서드 내부에서 배열의 필드를 선언하고 값을 할당할 수 있다.
 */

/* Array는 크기를 결정해줘야 한다.
- Array는 고정된 크기의 배열. 리스트와는 달리 크기를 늘리고 줄일 수 없다.
- 크기를 늘리고 싶다면 새로운 Array를 만들어서 거기에 대입을 해줘야 한다.

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
