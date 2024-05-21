import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(); // 좌표의 개수
		
		int[] org = new int[N]; // 정렬 전 좌표
		int[] sorted = new int[N]; // 정렬 후 좌표
		
		// 좌표 초기화
		for (int i = 0; i < N; i++) {
		    int x = in.nextInt();
		    org[i] = x; sorted[i] = x;
		}
		
		// 정렬 후 좌표 정렬
		Arrays.sort(sorted);
		
		// 좌표의 순위 매기기
		Map<Integer, Integer> ranking = new HashMap<>(); // (좌표, 순위)
		int rank = 0;
		for (int x : sorted) {
		    if (!ranking.containsKey(x)) // x 좌표가 존재하지 않는 경우에만 ranking에 넣음
		        ranking.put(x, rank++);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int x : org) {
		    sb.append(ranking.get(x)).append(" ");
		}
		System.out.println(sb);
	}
}