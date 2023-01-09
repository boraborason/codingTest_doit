package codingTest.DataStructure03;

public class solved006 {

  public static void main(String[] args) throws Exception {

    int N = 15; // 합 포인터가 15 하나를 가르킬 경우를 미리 초기화
    int count = 1; //
    int start_point = 1;
    int end_point = 1;
    int sum = 1;

    while (end_point != N) { // end_point가 15일 때까지 루프
      if (sum == N) { // 연속된 합이 N과 같을 경우
        count++;
        end_point++;
        sum = sum + end_point;
      } else if (sum > N) { // 연속된 합이 N과 같을 경우
        sum = sum - start_point;
        start_point++;
      } else { // 연속된 합이 N과 같을 경우, 이동이동 1+2=3
        end_point++;
        sum = sum + end_point;
      }
    }
    System.out.println("갯수 : " + count);
  }
}
