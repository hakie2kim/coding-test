import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	// 출력할 결과물 저장
		
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		
		int start = 0;
		
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num > start) {
                // start + 1부터 입력받은 value 까지 push를 한다.
                for (int j = start + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                
                start = num;
            }
            
            // top에 있는 원소가 입력받은 값과 같지 않은 경우
            else if (stack.peek() != num) {
                System.out.println("NO");
                return;
            }
            
            // top에 있는 원소가 입력받은 값과 같은 경우
            stack.pop();
            sb.append('-').append('\n');
        }
        
        System.out.println(sb);
	}
}