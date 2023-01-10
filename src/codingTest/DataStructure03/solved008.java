package codingTest.DataStructure03;

public class solved008 {
    public static void main(String[] args) throws Exception {

        // 수의 갯수
        int Num = 10;

        int A[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int i = 0;
        int j = Num - 1;
        int count = 0;

        while (i < j) {
            if (A[i] + A[j] > Num) {
                j--;
            } else {
                i++;
                j--;
                count++;
                count++;
            }
        }
        System.out.println("count : " + count);
    }
}
