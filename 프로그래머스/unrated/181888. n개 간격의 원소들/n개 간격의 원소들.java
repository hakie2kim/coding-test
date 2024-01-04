import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> num_arr = new ArrayList<Integer>();
        
        for (int i = 0; i < num_list.length; i+=n) {
            num_arr.add(num_list[i]);
        }
        
        return num_arr.stream().mapToInt(Integer::intValue).toArray();
    }
}