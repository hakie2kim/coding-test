import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    final static int MAX = 1000 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    private static void dfs(int i) {
        visited[i] = true;
        
        for (int j = 1; j <= N; j++) {
            if (visited[j] == false && graph[i][j]) {
                dfs(j);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 노드의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수

        // 1. graph에 연결 정보 채우기
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u][v] = true;
            graph[v][u] = true;
        }
    
        // 2. dfs 재귀함수 호출
        for (int i = 1; i <= N; i++) {
            if (visited[i] == false) {
                dfs(i);
                answer++;
            }
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}