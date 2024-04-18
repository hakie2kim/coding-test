import java.util.*;
import java.io.*;

public class Main {
    static int N, M; // 자연수 1부터 N까지 중복 없이 길이가 M인 수열
    static int[] answer;
    
    private static void dfs(int start, int depth) {
        if (depth == M) {
            for (int num : answer) {
                System.out.print(num + " ");
            }
            System.out.println();
            
            return;
        }
        
        for (int i = start; i < N; i++) {
            answer[depth] = i+1;
            dfs(i+1, depth+1);
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
	
		answer = new int[M];
		
		dfs(0, 0);
	}
}