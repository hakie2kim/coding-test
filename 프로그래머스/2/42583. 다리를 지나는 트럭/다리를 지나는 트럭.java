import java.util.*;

class Solution {
    private List<Integer> passed = new ArrayList<>();
    private List<Integer> passing = new ArrayList<>();
    private List<Integer> toPass = new ArrayList<>();
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // int[] -> List로 변환
        for (int truck_weight : truck_weights) {
            toPass.add(truck_weight);
        }
        
        // 실제 길이만큼 빈 다리        
        for (int i = 1; i <= bridge_length; i++) {
            passing.add(0);
            toPass.add(0);
        }
        
        int time = 0;  
        while (!toPass.isEmpty()) {    
            // System.out.println(time);
            // System.out.println(passing);
            // System.out.println(toPass);
            
            time++;
            
            int first_truck_weight = passing.remove(0);
            if (first_truck_weight != 0)
                passed.add(first_truck_weight);
            
            int next_truck_weight = toPass.get(0);
            // 다리가 만차거나 트럭이 지나가면 무게를 초과하는 경우
            if (passing.size() == bridge_length ||
                passing.stream().mapToInt(Integer::intValue).sum() + next_truck_weight > weight) {
                passing.add(0);
                continue;
            }
            
            passing.add(toPass.remove(0));
        }
           
        return time;
    }
}