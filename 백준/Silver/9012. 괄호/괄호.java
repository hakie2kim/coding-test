import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			sb.append(solve(br.readLine())).append('\n');
		}
		
		System.out.println(sb);
	}
 
	public static String solve(String s) {
 
		Stack<Character> stack = new Stack<>();
 
		for (int i = 0; i < s.length(); i++) {
		    char c = s.charAt(i);
		    
		    // 여는 괄호인 경우
		    if (c == '(') {
		        stack.push(c);
		    }
		    // 아래는 모두 닫는 괄호인 경우
		    else if (stack.empty()) { // 스택이 비어있을 때 
		        return "NO";
		    }
		    else { // 기존 여는 괄호를 제거
		        stack.pop();
		    }
		}
		
		/* 스택의 잔여 요소가 
		있으면 (=여는 괄호가 더 많은 경우) "NO" 
		비어있으면 "YES" */
		
		if (stack.empty()) {
		    return "YES";
		} 
		return "NO";
	}
}