import java.util.*;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> daysToFin = new LinkedList<>();
        
        // 각 작업에 필요한 일 수
        for (int i = 0; i < progresses.length; i++) {
            daysToFin.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        
        while(!daysToFin.isEmpty()) {
            // daysToFin 꺼낸 값을 int형 변수 minDays에 저장
		    int minDays = daysToFin.poll();
            
			//해당 일자에 배포되는 총 기능의 수를 담기 위한 변수, int count를 1로 선언 및 초기화
            int count = 1;
            
            // 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포
            // daysToFin가 비어있지 않고, 
            // daysToFin.peek()의 값이 그 전에 poll()을 통해 얻은 값, 즉 minDays 보다 작은 동안
            while(!daysToFin.isEmpty() && daysToFin.peek() <= minDays){
                daysToFin.poll();
                count++;
            }
            
			// count의 값을 answer배열에 추가
            answer.add(count);            
        }
        
        return answer;
    }
}