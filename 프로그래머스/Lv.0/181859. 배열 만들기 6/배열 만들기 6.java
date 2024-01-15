import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<Integer>();
        
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i++]);
                continue;
            }
            
            int lastElem = stk.peek();
            int ithElem = arr[i++];
            
            if (lastElem == ithElem) {
                stk.pop();
            } else {
                stk.push(ithElem);
            }     
        }
        
        return stk.isEmpty() ? new int[]{-1} : stk.stream().mapToInt(Integer::intValue).toArray();
    }
}