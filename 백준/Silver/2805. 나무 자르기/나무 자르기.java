import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); // 나무의 수
		int M = Integer.parseInt(st.nextToken()); // 집으로 갖고 가려는 나무의 길이
		
		int[] tree = new int[N];
		
		int min = 0;
		int max = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			
			/*
			 * 나무들 중 최댓값을 구하기 위해 매 입력 때마다 max 변수와 비교하여
			 * 입력 받은 나무가 max보다 클 경우 max 값을 해당 나무의 높이로 갱신해준다. 
			 */
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		
		// 이분 탐색 - upper bound
		while (min < max) {
		    int mid = (min + max) / 2;
		    
		    long sum = 0;
		    for (int i = 0; i < N; i++) {
		        // 자르는 위치가 나무 높이보다 높은 경우 제외
		        if (tree[i] > mid) {
		            sum += (tree[i] - mid);
		        }
		    }
		    
		    /*
		      자른 나무 길이의 합 > M: 자르는 높이를 높여야 함
		      자른 나무 길이의 합 = M: 최대한 적게 잘라야 함
		    */
		    if (sum >= M) {
		        min = mid + 1;
		        
		    }
		    /*
		      자른 나무 길이의 합 < M: 자르는 높이를 낮춰야 함
		    */
		    else {
		        max = mid;
		    }
		}
		
		System.out.println(min - 1);
	}
}