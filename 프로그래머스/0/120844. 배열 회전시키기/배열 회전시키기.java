class Solution {
    public int[] solution(int[] numbers, String direction) {
        // RIGHT
        // origin -> answer (인덱스) 
        // 0      -> 1%3 = (origin + 1) % origin.length 
        // 1      -> 2%3
        // 2      -> 3%3
        
        // LEFT
        // origin -> answer (인덱스) 
        // 0      -> 2%3 = 2 = (origin + origin.length-1) % origin.length 
        // 1      -> 3%3 = 0
        // 2      -> 4%3 = 1
        
        int numsLen = numbers.length;
        int[] answer = new int[numsLen];
        
        int shift = 1; // "right"
        if (direction.equals("left"))
            shift = numsLen - 1;            
        
        for (int i = 0; i < numsLen; i++) {
            answer[(i + shift) % numsLen] = numbers[i];
        }
        
        return answer;
    }
}