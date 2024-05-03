import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자 카드가 각각 몇 개 있는지 확인
		int N = Integer.parseInt(br.readLine()); // 숫자 카드의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> 숫자_카드의_개수 = new HashMap<>();
		for (int i = 0; i < N; i++) {
		    int 숫자_카드 = Integer.parseInt(st.nextToken());
		    숫자_카드의_개수.put(숫자_카드, 숫자_카드의_개수.getOrDefault(숫자_카드, 0) + 1);
		}
		
		// 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < M; i++) {
		    int 숫자_카드 = Integer.parseInt(st.nextToken());
		    answer.append(숫자_카드의_개수.getOrDefault(숫자_카드, 0)).append(" ");
		}
		System.out.println(answer);
		
	}
}