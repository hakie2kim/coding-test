import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int a = slicer[0]; int b = slicer[1]; int c = slicer[2];
        
        switch(n) {
            case 1:
                return Arrays.copyOfRange(num_list, 0, b+1); // 0번 인덱스부터 b번 인덱스까지
            case 2:
                return Arrays.copyOfRange(num_list, a, num_list.length); // a번 인덱스부터 마지막까지
            case 3:
                return Arrays.copyOfRange(num_list, a, b+1); // a번 인덱스부터 b번 인덱스까지
            case 4:
                for (int i = a; i <= b; i += c) {
                    answer.add(num_list[i]);
                }
                return answer.stream().mapToInt(Integer::intValue).toArray();
        }
        return new int[0];
    }
}