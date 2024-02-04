class Solution {
    public int solution(int[] numbers, int k) {        
        // case 2:    k 
        // idx 0 -> 2 1
        // idx 2 -> 4 2 
        // idx 4 -> 0 3
        // idx 0 -> 2 4 
        // idx 2 -> 4 5
        // => 공을 던진 사람이기 때문에 k = 4일 때
        return numbers[((k-1) * 2) % numbers.length];
    }
}