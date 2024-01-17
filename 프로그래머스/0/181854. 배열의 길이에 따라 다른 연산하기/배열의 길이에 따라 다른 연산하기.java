class Solution {
    public int[] solution(int[] arr, int n) {
        int arrLength = arr.length;
        // arr의 길이가 홀수라면 짝수 인덱스부터
        // arr의 길이가 짝수라면 홀수 인덱스부터
        int startIdx = arrLength % 2 == 0 ? 1 : 0; 
        
        for (int i = startIdx; i < arr.length; i += 2) {
            arr[i] += n;
        }
        
        return arr;
    }
}