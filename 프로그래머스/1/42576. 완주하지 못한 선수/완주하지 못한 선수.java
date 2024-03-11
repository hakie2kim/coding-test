import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // <참가자 이름, 완주 여부>
        Map<String, Integer> nameCnts = new HashMap<>();
        
        // 같은 이름 고려해 이름이 없는 경우 0 그외는 기존에 저장돼 있는 값 + 1
        for (String name : participant) {
            nameCnts.put(name, nameCnts.getOrDefault(name, 0) + 1);
        }
        
        // 완주한 경우 -1
        // 이름이 없는 경우 0 그외는 기존에 저장돼 있는 값 - 1
        for (String name : completion) { 
            nameCnts.put(name, nameCnts.getOrDefault(name, 0) - 1);
        }
        
        // 완주하지 못한 경우 value 값은 1
        for (String name : nameCnts.keySet()) {
            if (nameCnts.get(name) == 1) {
                answer = name;
                break;
            }
        }
        
        return answer;
    }
}