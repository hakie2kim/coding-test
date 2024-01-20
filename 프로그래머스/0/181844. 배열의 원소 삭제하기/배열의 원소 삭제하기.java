import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arr_to_arrayList = new ArrayList<Integer>();
        for (int elem : arr) {
            arr_to_arrayList.add(elem);
        }
        
        for (int elem_to_del : delete_list) {
            int idx = arr_to_arrayList.indexOf(elem_to_del);
            
            if (idx != -1) {
                arr_to_arrayList.remove(idx);
            }
        }
        
        return arr_to_arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}