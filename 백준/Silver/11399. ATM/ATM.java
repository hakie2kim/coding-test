import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
 
public class Main {
    static int[] time;
    static int totalMinTime = 0;
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		time = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(time);
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                totalMinTime += time[j];        
            }
        }
		
		System.out.println(totalMinTime);
	}
}