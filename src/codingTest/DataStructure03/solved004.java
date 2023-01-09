package codingTest.DataStructure03;

import java.util.Scanner;

public class solved004 {
  public static void main(String[] args) throws Exception {
    int numArr[][] = {
        { 0, 1, 2, 3, 4 },
        { 1, 1, 2, 3, 4 },
        { 2, 2, 3, 4, 5 },
        { 3, 3, 4, 5, 6 },
        { 4, 4, 5, 6, 7 },
    };

    // D는 합배열, numArr는 원배열
    int D[][] = new int[5][5];

    // 합배열 만들기
    for (int i = 1; i < numArr.length; i++) {
      for (int j = 1; j < numArr.length; j++) {

        D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + numArr[i][j]; // 전체에서 사이드?를 빼고 / 중복으로 뺀 포인트를 더한 후 / 원배열
                                                                              // 포인트를 더한다
      }
    }

    // 질의의 수만큼 반복해야 하지만 1번으로 고정

    Scanner sc = new Scanner(System.in);
    System.out.println("합을 구하고 싶은 범위는?");
    int x1 = sc.nextInt();// 2
    int y1 = sc.nextInt();// 2
    int x2 = sc.nextInt();// 3
    int y2 = sc.nextInt();// 3

    int result = D[x2][y2] - D[x2][y1 - 1] - D[x1 - 1][y2] + D[x1 - 1][y1 - 1];

    System.out.println(result);
    sc.close();
  }

}
