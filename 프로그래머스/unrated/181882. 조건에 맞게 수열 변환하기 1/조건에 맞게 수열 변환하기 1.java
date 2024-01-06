class Solution {
    public int[] solution(int[] arr) {
        // for (int num : arr) { 향상된 for문은 참조가 되지 않음 -> 값 변경 X
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50) {
                if (arr[i] % 2 == 0)
                    arr[i] /= 2;
            } else {
                if (arr[i] % 2 == 1)
                    arr[i] *= 2;
            }
        }
        
        return arr;
    }
}