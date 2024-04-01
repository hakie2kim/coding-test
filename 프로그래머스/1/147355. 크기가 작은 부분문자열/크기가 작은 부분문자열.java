class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int pLen = p.length();
        long pNum = Long.parseLong(p);
        //    0123456
        // t="3141592"
        for (int i = 0; i < t.length() - pLen + 1; i++) {
            if (Long.parseLong(t.substring(i, i + pLen)) <= pNum)
                answer++;                
        }
        
        return answer;
    }
}