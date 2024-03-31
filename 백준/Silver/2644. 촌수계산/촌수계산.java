import java.util.*;
import java.io.*;

class Main {
    static int N, start, end, M;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int answer = -1;
    
    private static void dfs(int i, int count) {
        visited[i] = true;
        
        if (i == end) {
            answer = count;
            return;
        }
        
        for (int j = 0; j < graph[i].size(); j++) {
            int next = graph[i].get(j);
            
            if (visited[next] == false) {
                dfs(next, count + 1);
            }
        }
    }
   
    public static void main(String[] args) throws IOException{
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine()); // 노드의 개수
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken()); // 시작 노드
        end = Integer.parseInt(st.nextToken()); // 끝 노드
        // System.out.println(end);
        
        M = Integer.parseInt(br.readLine()); // 간선의 개수
        
        visited = new boolean[N+1];
        
        // graph 선언 후 초기화
        graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            graph[x].add(y);
            graph[y].add(x);
        }
        
        // System.out.println(Arrays.toString(graph));
        
        // dfs 호출
        dfs(start, 0);
        
        System.out.println(answer);
        
        bw.close();
        br.close();
    }
}