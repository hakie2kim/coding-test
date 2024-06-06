import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String NStr = br.readLine();
		int N = Integer.parseInt(NStr);
        
        int result = 0;
        // 각 자리 수의 합은 최대 N의 길이 * 9이기 때문에 (N - 최대 N의 길이 * 9) 미만일 수 는 없다.
        int start = N - NStr.length() * 9;
        for (int i = start; i < N; i++) {
            int number = i;
            int sum = 0; // 각 자리 수 합
            
            while (number != 0) {
                sum += number % 10; // 각 자릿수 더하기
                number /= 10;
            }
            
            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우) 
            if (sum + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
	}
}