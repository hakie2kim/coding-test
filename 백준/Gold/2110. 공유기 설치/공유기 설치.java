import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
import java.util.Arrays;
 
public class Main {
	
	public static int[] house;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken()); // 집의 개수
		int M = Integer.parseInt(st.nextToken()); // 공유기 개수
		
		house = new int[N];
		for(int i = 0; i < N; i++) {
			house[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(house);	// 이분탐색을 하기 위해선 반드시 정렬 되어있어야 한다.
		
		// 공유기간 최소 거리
        int lo = 1;
        int hi = (house[N-1] + house[0]) + 1;
        
        // Upper bound
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            
            /*
            설치 가능한 공유기 개수가 M보다 크거나 같으면
            최소 거리 줄임 -> 공유기 개수 줄임
            */
            if (canInstall(mid) < M) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        
        System.out.println(lo - 1);
	}
	
	// 최소 거리에 대해 설치 가능한 공유기 개수를 찾는 메소드
	public static int canInstall(int minDistance) {
		// 첫번째 위치는 무조건 설치
		int count = 1;
		int lastLocation = house[0];
		
		for (int i = 1; i < house.length; i++) {
		    int location = house[i];
		    
		    
		    /*
		     * 현재 위치와 직전 위치의 거리가 최소 거리 이상일 때
		     * - 공유기 설치 개수 증가
		     * - 마지막 설치 위치 갱신
		    */
		    if (location - lastLocation >= minDistance) {
		        count++;
		        lastLocation = location;
		    }
		}
		
		return count;
	}
	
}