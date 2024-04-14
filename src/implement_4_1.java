
import java.util.*;

public class implement_4_1 {

    public static void main(String[] args) {
        // 입력
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int x = 1, y = 1;
        String line = scan.nextLine();
        String[] arr = line.split(" ");

        // L R U D에 따른 이동
        for (String move : arr) {
            if (move.equals("L")) {
                if (y - 1 > 0)
                    y -= 1;
            } else if (move.equals("R")) {
                if (y + 1 < N)
                    y += 1;
            } else if (move.equals("U")) {
                if (x - 1 > 0)
                    x -= 1;
            } else if (move.equals("D")) {
                if (x + 1 < N)
                    x += 1;
            }
        }

        // 정답 출력
        System.out.println(x + " " + y);
    }

}
