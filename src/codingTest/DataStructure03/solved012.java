package codingTest.DataStructure03;

import java.util.Stack;

public class solved012 {
    public static void main(String[] args) throws Exception {
        // 조건 내 오른쪽에 있는 큰 수 중 가장 오른쪽에 있는 수, 없을 때는 -1출력

        int A[] = { 3, 5, 2, 7 }; // 받은 수

        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < A.length; i++) {
            // 스택이 비지 않았고 peek값이 배열의 값보다 작다면
            // 배열의 값을 현재 값에 업데이트
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                A[stack.pop()] = A[i];
            }
            stack.add(i);
        }
        while (!stack.isEmpty())
            A[stack.pop()] = -1;

        for (int i = 0; i < A.length; i++)
            sb.append(A[i]).append(" ");

        System.out.println(sb);
    }// https://dy-coding.tistory.com/entry/%EB%B0%B1%EC%A4%80-17298%EB%B2%88-%EC%98%A4%ED%81%B0%EC%88%98-java
}
