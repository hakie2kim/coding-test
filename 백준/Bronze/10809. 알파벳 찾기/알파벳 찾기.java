import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		String S = br.readLine();
		
		// 알파벳의 인덱스를 담을 배열
		int[] alphabetIndices = new int[26];
    
        // 알파벳 인덱스 = 각 알파벳 - 'a'
		for (char c = 'a'; c <= 'z'; c++) {
		    alphabetIndices[c-'a'] = S.indexOf(c);
		}
		
		for (int i = 0; i < alphabetIndices.length; i++) {
		    System.out.print(alphabetIndices[i] + " ");
		}
	}
}