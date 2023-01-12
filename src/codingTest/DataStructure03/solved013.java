package codingTest.DataStructure03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class solved013 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> myQueue = new LinkedList<>();

        System.out.println("몇개의 숫자를 받?");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            myQueue.add(i); // 1~N까지 큐에 삽입
        }

        while (myQueue.size() > 1) { // 카드가 한장 남을 때까지(2장 남았을 때도 수행해야함)
            myQueue.poll(); // 맨위카드 빼기 수행
            myQueue.add(myQueue.poll());// 그다음 카드 빼서 다시 넣기
        }
        System.out.println(myQueue.poll()); // 나머지 카드 출력
        sc.close();
    }
}
