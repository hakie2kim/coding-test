import java.util.*;

class Solution {
    private void modifyArr(int[] arr) {
        
    }
    
    public int solution(int[] arr) {        
        int repeat = 0;
        while (true) {
            int[] arrBefore = Arrays.copyOf(arr, arr.length);
            
            for (int i = 0; i <= arr.length-1; i++) {
                if (arr[i] >= 50 && (arr[i] % 2 == 0)) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && (arr[i] % 2 != 0)) {
                    arr[i] *= 2;
                    arr[i] += 1;
                }
            }
            
            if (Arrays.equals(arrBefore, arr)) {
                break;
            }
            
            repeat++;
        }
        return repeat;
    }
}