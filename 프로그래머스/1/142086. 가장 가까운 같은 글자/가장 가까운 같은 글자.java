class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        char[] sArr = s.toCharArray();
        for (int i = sArr.length-1; i >= 0; i--) {
            answer[i] = -1; // 자신과 같은 글자가 가까운 곳에 없으면
            
            for (int j = i-1; j >= 0; j--) {
                if (sArr[i] == sArr[j]) { // 기준 글자에 대해 자신과 같은 글자가 가까운 곳에 있으면
                    answer[i] = i-j; // 거리를 구하고 저장
                    break;
                }
            }
        }
        
        return answer;
    }
}