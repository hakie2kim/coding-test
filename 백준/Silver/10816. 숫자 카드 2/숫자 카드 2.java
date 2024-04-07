import java.util.*;
import java.io.*;

class Main {
    static int N, M;
    static Map<Integer, Integer> numbers = new HashMap<>();
    static StringBuilder answer = new StringBuilder();
        
    public static void main(String[] args) throws IOException{
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 상근이의 숫자 카드의 개수
        N = Integer.parseInt(br.readLine()); 
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            int currNumber = Integer.parseInt(st.nextToken());
            numbers.put(currNumber, numbers.getOrDefault(currNumber, 0) + 1);
        }
        
        // 상근이가 숫자 카드를 각각 몇 개 가지고 있는지
        M = Integer.parseInt(br.readLine()); 
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            answer.append(numbers.getOrDefault(target, 0) + " ");
        }
        
        System.out.println(answer.toString());
        
        bw.close();
        br.close();
    }
}