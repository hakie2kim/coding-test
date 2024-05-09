import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
	public static void main(String[] args) throws IOException{
 
		int N = Integer.parseInt(br.readLine()); // 단어의 개수
		
		int count = 0;
		for (int i = 0; i < N; i++) {
		    if (check(br.readLine()))
		        count++;
		}
		
		System.out.println(count);
	}
	
	private static boolean check(String word) {
	    boolean[] alphas = new boolean[26]; // 해당 알파벳이 나온 적이 있는지 확인 
	    int prev = 0;
	    
	    for (int i = 0; i < word.length(); i++) {
	        int now = word.charAt(i);
	        
	        if (prev != now) { // 이전과 다른 문자가 나온 경우
	            if (alphas[now-'a'] == false) { // now가 처음 나오는 경우
	                alphas[now-'a'] = true;
	                prev = now;
	            } else { // now가 또 나왔는데 이전에 이미 나온 경우
	                return false;
	            }
	        }
	    }
	    
	    return true;
	}
}