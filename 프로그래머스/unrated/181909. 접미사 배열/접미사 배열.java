import java.util.TreeSet;

class Solution {
    public String[] solution(String my_string) {
        // 자동 정렬하기 위해 Treeset 사용
        TreeSet<String> ans = new TreeSet<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            ans.add(my_string.substring(i));
        }
        
        return ans.stream().toArray(String[]::new);
    }
}