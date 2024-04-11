import java.util.*;
import java.util.stream.Collectors;

public class Greedy_3_3 {
    public static void main(String[] args) {
        // 문제 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] card = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                card[i][j] = sc.nextInt();
            }
        }

        // 풀이
        // 각 행의 최솟값들을 min에 저장하여 min의 최댓값 출력
        int[] min = new int[N];
        for (int i = 0; i < N; i++) {
            Arrays.sort(card[i]);
            min[i] = card[i][0];
        }
        Arrays.sort(min);
        System.out.println(min[min.length - 1]);
    }

    public static void betterSolution() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            int min_value = 10001;
            // 그 행에서의 최솟값 찾아서 min_value에 저장
            for (int j = 0; j < M; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            // 최솟값 중 최댓값 찾아서 result에 저장
            result = Math.max(result, min_value);
        }
        System.out.println(result);
    }
}
