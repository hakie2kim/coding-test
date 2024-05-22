import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
        
        // 수의 개수
		int N = Integer.parseInt(br.readLine());
        
		/*1. 각 숫자의 빈도수를 나타내는 배열 counting 초기화
		2. counting 배열의 각 값을 누적합으로 변환
		3. counting 배열의 각 값은 새로운 배열의 (시작점 - 1)에 위치*/
		
		// -1000부터 1000 숫자가 존재하는지 확인
		boolean[] nums = new boolean[2001];
		
		for (int i = 0; i < N; i++) {
		    // 0부터 시작하기 때문에 이에 대응하기 위해 -1000값이 인덱스 0에 위치하게 함
		    nums[Integer.parseInt(br.readLine()) + 1000] = true; 
		}
		
		// 정렬이 필요하지 않음
		
		for (int i = 0; i < 2001; i++) {
		    if (nums[i]) {
		        sb.append(i-1000).append("\n");
		    }
		}
		System.out.println(sb);
	}
}