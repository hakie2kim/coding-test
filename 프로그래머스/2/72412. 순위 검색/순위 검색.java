import java.util.*;

class Solution {
    public int[] solution(String[] info, String[] query) {         
        // 1. info를 기반으로 모든 조합의 combs를 만든다.
        Map<String, List<Integer>> combs = new HashMap<>();
        
        for (String i : info) {
            String[] data = i.split(" ");
            
            String[] languages = {data[0], "-"};
            String[] jobs = {data[1], "-"};
            String[] exps = {data[2], "-"};
            String[] foods = {data[3], "-"};
            Integer score = Integer.parseInt(data[4]);
            
            for (String lang : languages) 
                for (String job : jobs) 
                    for (String exp : exps) 
                        for (String food : foods) {
                            String[] keyData = {lang, job, exp, food};
                            String key = String.join(" ", keyData);
                            List<Integer> scores = combs.getOrDefault(key, new ArrayList<Integer>());
                            scores.add(score);
                            combs.put(key, scores);             
                        }
        }
        
        // 2. 각 combs의 value를 오름차순으로 정렬한다.
        for (List<Integer> scores : combs.values()) {
            scores.sort(null);
        }
        
        // 3. query 조건에 맞는 지원자를 갖고 온다.
        int[] answer = new int[query.length];
        int i = 0;
        for (String q : query) {
            String[] data = q.split(" and ");
            // System.out.println(data[3]);
            Integer target = Integer.parseInt(data[3].split(" ")[1]);
            data[3] = data[3].split(" ")[0];
            String key = String.join(" ", data);
            
            if (combs.containsKey(key)) {
                List<Integer> scores = combs.get(key);
                // 4. binary search를 통해서 lower-bound를 찾는다.
                int left = 0;
                int right = scores.size();
                while(left < right) {
                    int mid = (left + right) / 2;
                    if (scores.get(mid) >= target)
                        right = mid;
                    else
                        left = mid + 1;
                    
                }
                
                answer[i] = scores.size() - left;
            }
            i++;
        }
        
            
                            
        
        
        return answer;
    }
}