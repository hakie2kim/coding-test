import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr) {
        LinkedList<Integer> stk = new LinkedList<>();
        
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i++]);
            } else if(stk.peekLast() < arr[i]) {
                stk.add(arr[i++]);
            } else {
                stk.removeLast();
            }
        }
           
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}