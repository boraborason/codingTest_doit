package codingTest.DataStructure03;

import java.util.Scanner;

/* 
숫자 합구하기
*/
public class solved001 {
  public static void main(String[] args) throws Exception {

    int sum = 0;
    Scanner sc = new Scanner(System.in);

    String S = sc.next();// 문자열을 입력받음

    char[] cNum = S.toCharArray();// 문자열을 한 글자씩 cvchar타입의 배열에 집어넣는 메소드

    for (int i = 0; i < cNum.length; i++) {

      sum += cNum[i] - '0'; // 문자를 숫자로 변경하려면 '아스키코드'로
                            // 문자를 숫자로 변환시 '1'-49 or '1'-'0'

    }

    System.out.println("합계 : " + sum);
  }
}