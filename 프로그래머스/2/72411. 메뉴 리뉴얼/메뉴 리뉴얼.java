import java.util.*;

class Solution {
    
    Map<String, Integer> combs = new HashMap<>();
    List<String> answer = new ArrayList<>();
    
    public List<String> solution(String[] orders, int[] course) {
        // String[] answer = {};
        
        // orders 정렬
        for (int i = 0; i < orders.length; i++) {
            char[] order = orders[i].toCharArray();
            Arrays.sort(order);
            orders[i] = String.valueOf(order);
        }
        // System.out.println(Arrays.toString(orders));
        
        // 각 주문마다 course 길이만큼의 조합 찾기     
        for (int length : course) {
            for (String order : orders) 
                combination("", order, length);
            
            // 가장 많은 조합을 저장
            if (!combs.isEmpty()) {
                List<Integer> countList = new ArrayList<>(combs.values());
                int max = Collections.max(countList);
                
                if (max > 1) {
                    for (String key : combs.keySet()) {
                        if (combs.get(key) == max)
                            answer.add(key);
                    }
                }
                
                combs.clear();
            }
            
        }
        
        Collections.sort(answer);
        return answer;
    }
    
    public void combination(String order, String others, int count) {
        if (count == 0) {
            combs.put(order, combs.getOrDefault(order, 0) + 1);
            return;
        }
        
        for (int i = 0; i < others.length(); i++) {
            combination(order + others.charAt(i), others.substring(i+1), count-1);
        }
    }
}