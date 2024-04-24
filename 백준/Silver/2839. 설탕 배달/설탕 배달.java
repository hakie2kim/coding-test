import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		// 5로 나눠 떨어질 때까지 3을 반복해서 차감
		while(true) {
		    if (N % 5 == 0) {
		        cnt += N / 5;
		        N /= 5;
		        System.out.println(cnt);
		        break;
		    } 
		    
		    if (N < 3) {
		        System.out.println(-1);
		        break;
		    }
		    
		    N -= 3;
		    cnt += 1;
		}
	}
}