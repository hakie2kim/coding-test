import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int sequence = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 도감에 수록되어 있는 포켓몬의 개수
		int M = Integer.parseInt(st.nextToken()); // 내가 맞춰야 하는 문제의 개수
		
		// 도감에 수록되어 있는 포켓몬 저장
		Map<Integer, String> 번호_포켓몬들 = new HashMap<>();
		Map<String, Integer> 포켓몬들_번호 = new HashMap<>();
		for (int i = 0; i < N; i++) {
		    String 포켓몬 = br.readLine();
		    번호_포켓몬들.put(++sequence, 포켓몬);
		    포켓몬들_번호.put(포켓몬, sequence);
		}
		
		// 맞춰야하는 문제
		for (int i = 0; i < M; i++) {
		    String question = br.readLine();
		    try { // 번호인 경우
		        Integer 번호 = Integer.parseInt(question);
		        System.out.println(번호_포켓몬들.get(번호));
		    } catch(NumberFormatException nfe) { // 번호가 아닌 경우
		        System.out.println(포켓몬들_번호.get(question));
		    }
		}
	}

}