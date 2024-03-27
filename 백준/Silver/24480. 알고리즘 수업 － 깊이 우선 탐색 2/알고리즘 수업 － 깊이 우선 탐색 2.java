import java.util.*;
import java.io.*;

class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;
    static int order = 1;
    static int N, M, R;
    
    public static void dfs(int i) {
        visited[i] = true;
        answer[i] = order++;
        
        for (int j = 0; j < graph[i].size(); j++) {
            int next = graph[i].get(j);
            
            if (visited[next] == false)
                dfs(next);
        }
    }

    public static void main(String[] args) throws IOException{
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 노드의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수
        R = Integer.parseInt(st.nextToken()); // 시작 노드
        
        // graph 선언
        graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        
        visited = new boolean[N+1];
        answer = new int[N+1];
        
        // 1. graph에 정보 입력
        for (int i = 0; i < M; i++) {            
            st = new StringTokenizer(br.readLine());
            
            int u = Integer.parseInt(st.nextToken()); // 노드의 개수
            int v = Integer.parseInt(st.nextToken()); // 간선의 개수
            
            graph[u].add(v);
            graph[v].add(u);
        }
        
        // 2. 내림차순 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
        }
        
        // dfs (재귀함수) 호출
        dfs(R);
        
        for (int i = 1; i <= N; i++)
            System.out.println(answer[i]);
        
        bw.close();
        br.close();
    }
}