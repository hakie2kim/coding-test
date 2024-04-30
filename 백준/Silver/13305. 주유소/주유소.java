import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    static int N;
    static long minPrice, totalPrice = 0;
    static long[] dist, price;
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		dist = new long[N-1]; price = new long[N];
		
		// 거리 저장
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N-1; i++) {
		    dist[i] = Long.parseLong(st.nextToken());
		}
		
		// 기름 가격 저장
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
		    price[i] = Long.parseLong(st.nextToken());
		}
		
		minPrice = price[0];
		for (int i = 0; i < N-1; i++) {
		    // 이전 주유소의 기름 값이 더 싼 경우 = 이전 주유소에서 기름을 채우는 것
		    if (minPrice > price[i]) {
		        minPrice = price[i];
		    }
		    
		    totalPrice += minPrice * dist[i];
		}
		
		System.out.println(totalPrice);
	}
}