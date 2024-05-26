/*
BufferedReader + charAt + 카운팅 정렬
*/
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String N = br.readLine();
        
        int[] cnts = new int[10];
        for (int i = 0; i < N.length(); i++) {
            cnts[N.charAt(i) - '0']++;
        }
        
        for (int i = 9; i >= 0; i--) {
            while (cnts[i]-- > 0)
                System.out.print(i);
        }
	}
}