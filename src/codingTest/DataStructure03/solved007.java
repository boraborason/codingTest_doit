package codingTest.DataStructure03;

import java.util.Arrays;
import java.util.Scanner;

public class solved007 {
    public static void main(String[] args) throws Exception {

        int materialNum = 6;
        int matching = 9;
        int S[] = new int[materialNum];

        Scanner sc = new Scanner(System.in);

        System.out.println("재료들을" + materialNum + "개 입력해 주세요");
        for (int i = 0; i < materialNum; i++) {
            S[i] = sc.nextInt();
        }

        Arrays.sort(S);

        int i = 0;
        int j = materialNum - 1;
        int count = 0;

        while (i < j) {
            if (S[i] + S[j] < matching) {
                i++;
            } else if (S[i] + S[j] > matching) {
                j--;
            } else { // 정렬로 더 볼 필요가 없으니 이동
                count++;
                i++;
                j--;
            }
        }
        System.out.println("count :" + count);

        sc.close();
    }
}
