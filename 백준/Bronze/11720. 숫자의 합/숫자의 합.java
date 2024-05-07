import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.
		
		String[] numbers = (br.readLine()).split("");
	    // System.out.println(Arrays.toString(numbers));
		
		int sum = 0;
		for (String number : numbers) {
		    sum += Integer.parseInt(number);
		}
		System.out.println(sum);
	}
}