import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    static int N;
    static int[] plate;
    static int counter = 0;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
        plate = new int[N];
        
        displayQueen(0);
        
        System.out.println(counter);
	}
	
	private static void displayQueen(int row) {
	    if (row == N) {
	        counter++;
	        return;
	    }
	    
	    for (int i = 0; i < N; i++) { // 열 column
	        plate[row] = i;
	        
	        if (possible(row)) {
	            displayQueen(row + 1);
	        }
	    }
	}
	
	private static boolean possible(int row) {
	    for (int i = 0; i < row; i++) {
	        // 해당 행의 열 값과 i행의 열 값이 같다면
	        if (plate[row] == plate[i]) {
	            return false;
	        }
	        
	        // 대각선 상 놓여있는 경우: 행의 차와 열의 차가 같은 경우
	        if (Math.abs(row - i) == Math.abs(plate[row] - plate[i])) {
	            return false;
	        }
	    }
	    
	    return true;
	}

}