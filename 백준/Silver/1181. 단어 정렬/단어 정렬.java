import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		String[] words = new String[N];
		for (int i = 0; i < N; i++) {
			words[i] = br.readLine();
		}
		
		Arrays.sort(words, (w1, w2) -> {
		    // 단어 길이가 다르면 짧은 것부터
		    if (w1.length() != w2.length()) {
		        return w1.length() - w2.length();
		    // 단어 길이가 같을 경우
		    } else {
		        return w1.compareTo(w2);
		    }
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(words[0]).append("\n");
		for (int i = 1; i < N; i++) {
		    if (!words[i].equals(words[i-1]))
		        sb.append(words[i]).append("\n");
		}
		System.out.println(sb);
	}
}