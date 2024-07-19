import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 열 개수, 배열의 크기
		int K = Integer.parseInt(br.readLine());
		
		// x는 lo <= x <= hi 의 범위를 갖는다.
		long lo = 1;
		long hi = K;
		
		// lower-bound
        while (lo < hi) {
            long mid = (lo + hi) / 2;
            long count = 0;
            
            /* x보다 작거나 같은 원소의 개수 = mid / i
             * N은 초과하지 않아야 함
             */
            for (int i = 1; i <= N; i++) {
                count += Math.min(mid / i, N);
            }
            
            if (K <= count) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        
        System.out.println(lo);
	}
}