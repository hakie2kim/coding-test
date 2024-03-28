import java.util.*;
import java.io.*;

class Main {
    static int N, M, V;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    // static List<> answer = new ArrayList<>();
    static ArrayList<Integer> queue;
    
    private static void dfs(int i) {
        visited[i] = true;
        // answer.add(i);
        System.out.print(i + " ");
        
        for (int j = 0; j < graph[i].size(); j++) {
            int next = graph[i].get(j);
            
            if (visited[next] == false)
                dfs(next);
        }
    }
    
    private static void bfs() {
        queue = new ArrayList<>();
        visited = new boolean[N+1];
        
        queue.add(V);
        visited[V] = true;
        
        while (!queue.isEmpty()) {
            int curr = queue.remove(0);
            System.out.print(curr + " ");
            
            for (int i = 1; i <= N; i++) {
                for (int j = 0; j < graph[curr].size(); j++) {
                    int next = graph[curr].get(j);
                    
                    if (visited[next] == false) {
                        queue.add(next);
                        visited[next] = true; 
                    }
                }
            }
            
        }
    }
   
    public static void main(String[] args) throws IOException{
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken()); // 노드의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수
        V = Integer.parseInt(st.nextToken()); // 시작할 노드의 번호
        
        visited = new boolean[N+1];
        // answer = new int[N+1];
        
        // graph 선언
        graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<Integer>();
        }
            
        // graph 초기화
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            graph[u].add(v);
            graph[v].add(u);
        }
        
        // graph 오름차순 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        
        // dfs (재귀함수) 호출
        dfs(V);
        System.out.println();
        
        // bfs 호출
        bfs();
        
        bw.close();
        br.close();
    }
}