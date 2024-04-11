

public class Greedy_3_1 {
    public int solution(int N) {
        int answer = 0;
        while (N - 500 >= 0) {
            N -= 500;
            answer++;
        }
        while (N - 100 >= 0) {
            N -= 100;
            answer++;
        }
        while (N - 50 >= 0) {
            N -= 50;
            answer++;
        }
        while (N - 10 >= 0) {
            N -= 10;
            answer++;
        }
        return answer;
    }

    public int betterSolution(int N){
        int answer = 0;
        int[] coins = { 500, 100, 50, 10 };
        for (int coin : coins) {
            answer += (N / coin);
            N %= coin;
        }
        return answer;
    }
}