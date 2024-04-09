import java.util.*;
import java.io.*;

public class Main {
    static Stack<Character> brackets = new Stack<>();
    static int answer = 0;
    
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bf.readLine();
        char[] inputArr = input.toCharArray();
        
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == '(') {
                brackets.push(inputArr[i]);
                continue;
            } else { // ')'인 경우
                brackets.pop();
                
                if (inputArr[i-1] == '(') { // '()'
                    answer += brackets.size();
                } else { // "))"
                    answer++;
                }
            }
        }
        
        System.out.println(answer);
        
        bf.close();
        bw.close();
	}
}