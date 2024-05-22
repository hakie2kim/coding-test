import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine()); // 수의 개수
		int[] nums = new int[N];
		
		// 배열 초기화
		for (int i = 0; i < N; i++) {
		    nums[i] = Integer.parseInt(br.readLine());
		}
		
		// 배열 정렬
		Arrays.sort(nums);
		
		// 정답 구성 후 출력
	    for (int num : nums) {
	        sb.append(num).append("\n");
	    }
        System.out.println(sb);
	}
}