import java.util.*;
import java.io.*;

class Main {
    static Stack<Character> psStk;
    static int T;

    public static void main(String[] args) throws IOException{
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        T = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= T; i++) {
            System.out.println(yesOrNo(br.readLine()));
        }
    
        bw.close();
        br.close();
    }
    
    private static String yesOrNo(String ps) {
        psStk = new Stack<>();
        
        for (char paren : ps.toCharArray()) {
            if (paren == '(') {
                psStk.push(paren);
            } else if (psStk.isEmpty()) { // 닫는 괄호이고 빈 스택인 경우
                return "NO";
            } else { // 닫는 괄호이고 빈 스택이 아닌 경우
                psStk.pop();
            }
        }
            
        if (psStk.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}