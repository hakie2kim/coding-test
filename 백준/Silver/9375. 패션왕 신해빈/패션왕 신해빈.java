import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스의 개수
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine()); // 해빈이가 가진 의상의 수
            
            Map<String, Integer> types = new HashMap<>(); // 의상 타입과 그 개수
            
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); // 의상의 이름은 중요하지 않음
                String type = st.nextToken();
                
                types.put(type, types.getOrDefault(type, 0) + 1);
            }
            
            int totalComb = 1;
            for (String name : types.keySet()) {
                totalComb *= types.get(name) + 1; // 각 타입을 안 입었을 경우 추가
            }
            System.out.println(totalComb - 1); // 알몸인 경우 제외
        }
    }
}