import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static int[] stack;
	public static int size = 0;
 
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
 
        stack = new int[N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;  
                case "top":
                    sb.append(top()).append('\n');
                    break;                    
            }
        }
        
        System.out.println(sb);
	}
 
	public static void push(int item) {
        stack[size++] = item; // size칸에 item을 넣고 size를 1증가
	}
	
	public static int pop() {
	    // 데이터가 한 개도 없을 경우 -1
        if (size == 0) {
            return -1;
        }
        
        // 인덱스는 0부터 시작하므로 최상단에 있는 요소는 항상 size-1 index에 위치
        int result = stack[size - 1];
        stack[size - 1] = 0; // 0으로 초기화
        size--;
        return result;
	}
	
	public static int size() {
        return size;
	}
	
	public static int empty() {
        if (size == 0) { // 스택이 비어있으면 1 반환
            return 1;
        }
        
        return 0;
	}
	
	public static int top() {
	    // 데이터가 한 개도 없을 경우 -1
        if (size == 0) {
            return -1;
        }
        
        // 인덱스는 0부터 시작하므로 최상단에 있는 요소는 항상 size-1 index에 위치
        return stack[size - 1];
	}
	
}