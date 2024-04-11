import java.util.*;
import java.io.*;

class Main {
    static int a, b, c;
    static Set<Integer> angles = new HashSet<>();
    static String answer;

    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 세 각
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        
        // 풀이 1
        if (a+b+c != 180) {
            System.out.println("Error");
        // 아래 세 가지 경우는 모두 각의 합이 180인 경우
        
        // 세 각이 모두 같은 경우
        } else if (a == b && b == c) { 
            System.out.println("Equilateral");
        
        // 두 각만 같은 경우 (위의 경우 제외)
        } else if (a == b || b == c || c == a) {
            System.out.println("Isosceles");
        
        // 모든 각이 다 다른 경우
        } else {
            System.out.println("Scalene");
        }
        
        // 풀이 2
        /*for (int i = 1; i <= 3; i++) {
            angles.add(Integer.parseInt(br.readLine()));
        }
        
        if (angles.stream().mapToInt(Integer::intValue).sum() == 180) {
            if (angles.size() == 1) {
                System.out.println("Equilateral");
            } else if (angles.size() == 2) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }*/
        
        bw.close();
        br.close();
    }
}