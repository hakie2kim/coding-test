import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    static String[] subtraction;
    static int sum = Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정 
    
    // 최솟값 -> 먼저 값을 모두 더한 다음 빼야 함
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		String[] subtraction = br.readLine().split("-");
		
        for (String part : subtraction) {
            String[] nums = part.split("\\+");
            
            int temp = 0;
            for (String num : nums) {
                temp += Integer.parseInt(num);
            }
            
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        
        System.out.println(sum);
	}
}