class Solution {
    public int solution(int[] array) {
        int[] counter = new int[1000];
        
        for (int elem : array) {
            counter[elem]++;
        }
        
        int max = counter[0];
        int maxIdx = 0;
        for (int i = 1; i < counter.length; i++) {
            if (counter[maxIdx] < counter[i]) {
                max = counter[i];
                maxIdx = i;
            }
        }
        
        int maxCounter = 0; // 같은 최빈값이 여러 개인 지
        for(int j = 0; j < counter.length; j++) {
            if (max == counter[j]) 
                maxCounter++;
            
            if (maxCounter > 1) 
                maxIdx = -1;
        }
        
        return maxIdx;
    }
}