import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        // 수의 개수
		int N = Integer.parseInt(br.readLine());
		
		// 수 카운팅 배열 초기화
		int[] nums = new int[10001]; // 1 ~ 10000. 맨 앞 0은 무시
		for(int i = 0; i < N; i++) {
			nums[Integer.parseInt(br.readLine())]++;
		}
        
        // 출력
		for(int i = 1; i < 10001; i++){
		    // i값이 개수가 0이 될 때까지 출력 (빈도수)
		    while (nums[i]-- > 0) {
		        sb.append(i).append('\n');
		    }
		}
		System.out.println(sb);
	}
}