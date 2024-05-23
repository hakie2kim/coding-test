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
		
		/*
		  -1000000 ~ 1000000
		  기준점 0 = index 100000 으로 생각
		*/
		boolean[] nums = new boolean[2000001];
		
		// 어떤 수가 존재하는지 알려주는 배열 초기화
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
		    nums[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		
		// 출력
		for (int i = 0; i < nums.length; i++) {
		    if (nums[i]) {
		        sb.append(i-1000000).append("\n");
		    }
		}
	    System.out.println(sb);
	}
}