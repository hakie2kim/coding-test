import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    int N = Integer.parseInt(br.readLine()); // 온라인 저지 회원의 수 N
	    
	    // 온라인 저지 회원 초기화
	    Person[] members = new Person[N];
	    for (int i = 0; i < N; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        members[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
	    }
	    
	    // 회원을 나이 순으로 정렬
	    Arrays.sort(members, (p1, p2) -> {
	        return p1.age - p2.age;
	    });
	    
	    // 정답 출력
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < N; i++) {
	        Person member = members[i];
	        sb.append(member.age).append(" ").append(member.name).append("\n");
	    }
	    System.out.println(sb);
	}	
 
}

class Person {
    int age;
    String name;
    
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}