import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    static int N, K;
    static int[] A;
    static int cnt = 0;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 첫번째 줄
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		// 첫번째 줄 이후
		A = new int[N];
		for (int i = 0; i < N; i++) {
		    A[i] = Integer.parseInt(br.readLine());
		}
		
		// 가장 큰 동전부터
		for (int i = N-1; i >= 0; i--) {
		    int currA = A[i];
		    
		    if (K/currA > 0) {
		        cnt += K/currA;
		        K %= currA;;
		    }
		    
		}
		
		System.out.println(cnt);
	}
}