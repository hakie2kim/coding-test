import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        // ArrayList<Integer> answer = new ArrayList<Integer>();
        Stack<Integer> X = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            for (int j = 1; j <= elem * 2; j++) { // X에서 마지막 arr[i] * 2개의 원소를 제거
                if (flag[i]) {
                    X.push(elem);
                } else {
                    X.pop();
                    
                    if (elem == j) // X에서 마지막 arr[i]개의 원소를 제거
                        break;
                }            
            }
        }
        
        return X.stream().mapToInt(Integer::intValue).toArray();
    }
}