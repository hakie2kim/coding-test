import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
 
public class Main {
    static int[] time;
    static int prevTime = 0;
    static int totalMinTime = 0;
    
    // 총 대기시간을 줄이려면 앞 사람이 일찍 끝내야 그만큼 대기시간을 줄일 수 있음
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		time = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        
        // 1. 정렬 
        Arrays.sort(time);
        
        // 2. i번째 사람이 인출을 끝날 때까지의 시간을 구하기
        for (int i = 0; i < N; i++) {
            totalMinTime += prevTime + time[i]; // 이전 사람 + 현재 인출하려는 사람
            prevTime += time[i]; // 이전까지의 누적합
        }
		
		System.out.println(totalMinTime);
	}
 
}