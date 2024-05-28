import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] points = new int[N][2];
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
		    st = new StringTokenizer(br.readLine());
		    
		    points[i][0] = Integer.parseInt(st.nextToken());
		    points[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(points, (p1, p2) -> {
		   // y좌표가 같은 경우
		   if (p1[1] == p2[1]) {
		       return p1[0] - p2[0];
		   } else {
		       return p1[1] - p2[1];
		   }
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
		    sb.append(points[i][0] + " ").append(points[i][1] + "\n");
		}
		System.out.println(sb);
	}
}