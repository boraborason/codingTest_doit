package codingTest.DataStructure03;

import java.util.Scanner;

public class solved005 {
  public static void main(String[] args) throws Exception {

    int N = 5; // 수열의 갯수
    int M = 3; // 나눌 수
    int result = 0;

    Scanner sc = new Scanner(System.in);

    int S[] = new int[N + 1];

    for (int i = 1; i <= N; i++) {

      S[i] = S[i - 1] + sc.nextInt(); // 숫자 입력 받으면서 합배열 생성

    }

    for (int j = 1; j <= N; j++) { // 5번 돌면서 나누기

      if (S[j] % M == 0)
        result++;
    }
    System.out.println("합배열 0으로 나누어 떨어지는 숫자의 갯수는" + result); // 문제를 이해하지 못함..2회독 때 다시
    sc.close();
  }
}
