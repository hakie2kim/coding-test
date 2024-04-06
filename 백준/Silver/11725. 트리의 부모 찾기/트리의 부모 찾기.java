import java.util.*;
import java.io.*;

public class Main
{
    static int N;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;
    
    private static void dfs(int i) {
        visited[i] = true;
        
        for (int j = 0; j < graph[i].size(); j++) {
            int next = graph[i].get(j);
            
            if (visited[next] == false) {
                answer[next] = i;
                dfs(next);
            }
        }
    }
    
   
    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        
        // 1. graph 및 다른 배열에 연결 정보 채우기
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        answer = new int[N+1];
        
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            graph[x].add(y);
            graph[y].add(x);
        }
        
        // 2. dfs 호출
        dfs(1);
        
        // 3. 정답 출력
        for (int i = 2; i <= N; i++) {
            System.out.println(answer[i]);
        }
        
        bw.close();
        br.close();
    }
}
