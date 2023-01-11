package codingTest.DataStructure03;

import java.util.ArrayList;
import java.util.Stack;

public class solved011 {
    public static void main(String[] args) throws Exception {
        int Num = 8;
        int NumArr[] = { 4, 3, 6, 8, 7, 5, 2, 1 };

        Stack<Integer> stack = new Stack<>();

        // +, - 담을 리스트
        ArrayList<String> array = new ArrayList<String>();

        // 수열 index
        int index = 0;

        for (int i = 1; i <= Num; i++) {
            stack.push(i);
            array.add("+");
            while (!stack.isEmpty()) {
                // stack의 탑과 리스트가 같은 경우
                if (stack.peek() == NumArr[index]) {
                    stack.pop();
                    array.add("-");
                    index++;
                } else {
                    break;
                }
            }
        }

        if (!stack.isEmpty()) { // 순서대로 팝 했으므로 비어있어야함
            System.out.println("NO");
        } else {
            for (String st : array) {
                System.out.println(st);
            }
        }

    }
}
