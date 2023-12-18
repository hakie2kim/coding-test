import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num :num_list) {
            list.add(num);
        }
        
        int last = list.get(num_list.length - 1);
        int secondFromLast = list.get(num_list.length - 2);
        
        list.add(last > secondFromLast ? last - secondFromLast : last * 2);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}