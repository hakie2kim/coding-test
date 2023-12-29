import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        // 자동 정렬하기 위해 Treeset 사용
        /* TreeSet<String> ans = new TreeSet<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            ans.add(my_string.substring(i));
        } */
        
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            ans.add(my_string.substring(i));
        }
        
        // return ans.stream().sorted().toArray(String[]::new);
        
        // return ans.toArray(new String[ans.size()]);
        
        Collections.sort(ans);
        return ans.toArray(String[]::new);
    }
}