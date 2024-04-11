import java.util.*;

public class Greedy_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 0;

        // K로 나누어 떨어지면 무조건 2번 연산 수행
        while (N != 1) {
            if (N % K == 0) {
                N /= K;
            } else {
                N -= 1;
            }
            result++;
        }
        System.out.println(result);
    }

}
