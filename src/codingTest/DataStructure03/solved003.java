package codingTest.DataStructure03;

import java.util.Scanner;

public class solved003 {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    System.out.println("데이터는 몇개?");
    int DataNum = sc.nextInt();

    System.out.println("몇 번 질문?");
    int QuNum = sc.nextInt();

    int A[] = new int[DataNum + 1]; // 새로운 배열생성

    System.out.println("데이터를 입력해주세요");
    for (int i = 1; i <= DataNum; i++) {

      A[i] = A[i - 1] + sc.nextInt();

    }

    for (int j = 1; j <= QuNum; j++) {

      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(A[b] - A[a - 1]); // b의 값에서 a-1의 값을 제외
    }

  }
}
