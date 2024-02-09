class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] numsAndZs = s.split(" ");
        for (int i = 0; i < numsAndZs.length; i++) {
            if (numsAndZs[i].equals("Z")) { // Z를 만나면 이전에 더한 것을 뺌
                answer -= Integer.parseInt(numsAndZs[i-1]);
            } else { // 숫자면 계속 더함
                answer += Integer.parseInt(numsAndZs[i]);
            }
        }
        
        return answer;
    }
}