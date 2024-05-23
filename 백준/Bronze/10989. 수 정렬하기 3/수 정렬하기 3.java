import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        // 수의 개수
		int N = Integer.parseInt(br.readLine());
		
		// 수 배열 초기화
		int[] arr = new int[N];
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
        
        // 정렬
		Arrays.sort(arr);
        
        // 출력
		for(int i = 0; i < N; i++){
			sb.append(arr[i]).append('\n');
		}
		System.out.println(sb);
	}
}