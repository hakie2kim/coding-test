class Solution {
    public int[] solution(int[] arr) {
        // for (int num : arr) {
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