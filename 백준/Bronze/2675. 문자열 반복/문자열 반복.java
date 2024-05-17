import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
		    String[] line = br.readLine().split(" ");
		    
		    for (char letter : line[1].toCharArray()) {
		        System.out.print(String.valueOf(letter).repeat(Integer.parseInt(line[0])));
		    }
		    System.out.println();
		}
	}
}