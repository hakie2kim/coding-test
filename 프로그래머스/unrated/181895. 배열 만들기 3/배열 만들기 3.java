import java.util.*;
import java.util.stream.Collectors; 

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        for (int elem : arr) {
            arr_list.add(elem);
        } // arr를 int[]에서 ArrayList<Integer>로 변환
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int[] interval : intervals) {
            answer.addAll(arr_list.subList(interval[0], interval[1]+1));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}