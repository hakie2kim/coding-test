import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] answer;
    
    private static void dfs(int depth) {
        if (depth == M) {
            for (int elem : answer) {
                System.out.print(elem + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = 0; i < N; i++) {
		    if (visited[i] == false) {
		        visited[i] = true;
		        answer[depth] = i+1;
		        dfs(depth + 1);
		        visited[i] = false;
		    }
		}
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N];
		answer = new int[M];
		
		dfs(0);
	}
}