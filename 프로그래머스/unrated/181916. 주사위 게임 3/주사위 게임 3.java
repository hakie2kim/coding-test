import java.util.Arrays;

public class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        // 네 주사위에서 모두 같은 숫자인 경우
        if (dice[0] == dice[3]) {
            return dice[0] * 1111;
        }

        // 세 주사위에서 두 숫자가 같은 경우
        if ((dice[0] == dice[2] && dice[3] != dice[0]) || (dice[1] == dice[3] && dice[0] != dice[1])) {
            int p = dice[0] == dice[2] ? dice[0] : dice[1];
            int q = dice[0] == dice[2] ? dice[3] : dice[0];
            return (10 * p + q) * (10 * p + q);
        }

        // 두 쌍이 같은 숫자인 경우
        if ((dice[0] == dice[1] && dice[2] == dice[3]) && (dice[0] != dice[2])) {
            return (dice[0] + dice[2]) * (dice[2] - dice[0]);
        }

        // 두 쌍이 다른 숫자인 경우
        if ((dice[0] == dice[1] && dice[2] != dice[3]) ||
            (dice[1] == dice[2] && dice[0] != dice[3]) || 
            (dice[2] == dice[3] && dice[0] != dice[1]) 
           ) {
            return dice[0] == dice[1] ? dice[2] * dice[3] : (dice[1] == dice[2] ? dice[0] * dice[3] : dice[0] * dice[1]);
        }

        // 네 주사위의 숫자가 모두 다른 경우
        return dice[0];
    }
}
