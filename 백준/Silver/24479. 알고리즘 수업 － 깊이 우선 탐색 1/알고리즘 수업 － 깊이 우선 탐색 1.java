import java.io.*;
import java.util.*;

public class Main {
  // static final int MAX = 100000 + 10;
  static int N, M, R;
  static ArrayList<Integer>[] graph;
  static boolean[] visited;
  static int[] answer;
  static int order;
    
    private static void dfs(int i) {
        visited[i] = true;
        answer[i] = order++;
        
        for (int j = 0; j < graph[i].size(); j++) {
            int next = graph[i].get(j);
            
            if (visited[next] == false)
                dfs(next);
        }
    }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken()); // 노드
    M = Integer.parseInt(st.nextToken()); // 간선
    R = Integer.parseInt(st.nextToken()); // 시작 정점
    
    // 배열 ArrayList 선언
    graph = new ArrayList[N+1];
    for (int i = 1; i <= N; i++) 
        graph[i] = new ArrayList<Integer>();
    
    visited = new boolean[N+1];
    answer = new int[N+1];
    order = 1;   
    
    // 1. graph에 연결 정보 채우기
    for (int i = 0; i < M; i++) {
        st = new StringTokenizer(br.readLine());
        
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        
        graph[u].add(v);
        graph[v].add(u);
    }
        
    // 2. 오름차순 정렬
    for (int i = 1; i <= N; i++) {
        Collections.sort(graph[i]);
    }
        
    // 3. dfs (재귀함수) 호출
    dfs(R);
        
        // 4. 출력
        for (int i = 1; i <= N; i++) {
          System.out.println(answer[i]);
        }

    bw.close();
    br.close();
  }
}