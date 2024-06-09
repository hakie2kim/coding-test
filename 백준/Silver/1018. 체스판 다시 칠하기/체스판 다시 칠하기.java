import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
 
	public static boolean[][] arr;
	public static int min = 64;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
 
		arr = new boolean[N][M];
		
 
		// 배열 입력 
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			
			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;		// W일 때는 true 
				} else {
					arr[i][j] = false;		// B일 때는 false
				}
			}
		}
 
		for (int i = 0; i <= N - 8; i++) {
		    for (int j = 0; j <= M - 8; j++) {
		        find(i, j);
		    }
		}
		
		System.out.println(min);
	}
 
	
	public static void find(int x, int y) {
	    int endX = x + 8;
	    int endY = y + 8;
	    int count = 0;
	    
	    boolean WB = arr[x][y]; // 첫 번째 칸의 색
	    
	    for (int i = x; i < endX; i++) {
		    for (int j = y; j < endY; j++) {
		        
		        // 색칠해야 하는 경우
		        if (arr[i][j] != WB) {
		            count++;
		        }
		        
		        // 다음 칸은 다른 색이어야 함
		        WB = !WB;
		    }
		    WB = !WB;
	    }
	    
	    /*
		 *  첫 번째 칸의 색을 기준으로 할 때의 색칠 할 개수(count)와
		 *  첫 번째 칸의 색과 반대되는 색을 기준으로 할 때의 색칠 할 개수(64 - count) 중 
		 *  최솟값을 count 에 저장 
		 */
	    count = Math.min(count, 64 - count);
	    
	    // 최솟값 갱신
	    min = Math.min(min, count);
	}
}