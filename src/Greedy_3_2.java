import java.util.*;
import java.util.stream.Collectors;

public class Greedy_3_2 {
    public static void main(String[] args) {
        // 문제 입력
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] f = s1.split(" ");
        int N = Integer.parseInt(f[0]), M = Integer.parseInt(f[1]), K = Integer.parseInt(f[2]);
        String[] f2 = s2.split(" ");
        int[] su = new int[f2.length];
        int i = 0;
        for (String d : f2) {
            su[i] = Integer.parseInt(d);
            i++;
        }

        // 풀이
        int answer = 0;
        Arrays.sort(su);
        while (M > 0) {
            if (su[su.length - 1] != su[su.length - 2]) {
                answer += su[su.length - 1] * K;
                answer += su[su.length - 2];
                M -= K + 1;
            } else {
                answer += su[su.length - 1] * M;
                break;
            }
        }
        System.out.println(answer);
    }

    public static void betterSolution() {
        // 문제 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 풀이
        int answer = 0;
        Arrays.sort(arr);
        // cnt: 가장 큰 수가 반복되는 수
        int cnt = M / (K + 1) * K;
        cnt += M % (K + 1);
        answer += cnt * arr[arr.length - 1];
        answer += (M - cnt) * arr[arr.length - 2];
        System.out.println(answer);
    }
}
