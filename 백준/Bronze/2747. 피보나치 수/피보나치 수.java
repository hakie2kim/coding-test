import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    private static int[] fibonacci;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		fibonacci = new int[n+1];
		fibonacci[0] = 0; fibonacci[1] = 1;
		
		for (int i = 2; i <= n; i++) {
		    fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		
        System.out.println(fibonacci[n]);
	}
}