import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
 
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		// List 배열로 숫자 초기화
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < N; i++) {
		    nums.add(Integer.parseInt(br.readLine()));
		}
		
		// 정렬
		Collections.sort(nums);
		
		// 출력
		for (int num : nums) {
		    sb.append(num).append("\n");
		}
	    System.out.println(sb);
	}
}