class Solution {
    public String solution(String[] seoul) {
        int loca = 0;
        
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                loca = i;
                break;
            }
        }
        
        return String.format("김서방은 %d에 있다", loca);
    }
}