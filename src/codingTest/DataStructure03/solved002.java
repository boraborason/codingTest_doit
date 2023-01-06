package codingTest.DataStructure03;

import java.util.Arrays;
import java.util.Scanner;

public class solved002 {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    System.out.println("과목 수 입력해주세요");
    int subNum = sc.nextInt(); // 과목 수 받기

    int A[] = new int[subNum]; // 과목 수 많은 배열을 생성

    System.out.println("과목별 점수를 입력해주세요");
    for (int i = 0; i < subNum; i++) { // 과목수 만큼 점수를 받을 것

      A[i] = sc.nextInt();

    }

    double max = 0;
    double sum = 0;
    double avg = 0;

    Arrays.sort(A); // 배열정렬
    max = A[A.length - 1];// 최대값

    for (int i = 0; i < A.length; i++) {

      sum += A[i];

    }

    avg = (sum / max) * 100 / A.length;

    System.out.println("avg : " + avg);

    sc.close();
  }
}