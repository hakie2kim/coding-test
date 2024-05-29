import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int factorial = 1;
		while (N != 0) {
		    factorial *= N;
		    N--;
		}
		System.out.println(factorial);
	}
}