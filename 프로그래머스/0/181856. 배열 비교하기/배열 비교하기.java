import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else {
            int arr1Sum = 0;
            int arr2Sum = 0;
            
            for (int num : arr1) {
                arr1Sum += num;
            }
            
            for (int num : arr2) {
                arr2Sum += num;
            }
            
            if (arr1Sum > arr2Sum) {
                return 1;
            } else if (arr1Sum < arr2Sum) {
                return -1;
            }
        }
        
        return 0;
    }
}