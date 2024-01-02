import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0]; int b = slicer[1]; int c = slicer[2];
        int[] answer = {};
         
        switch(n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, b+1); // 0번 인덱스부터 b번 인덱스까지
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, a, num_list.length); // a번 인덱스부터 마지막까지
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b+1); // a번 인덱스부터 b번 인덱스까지
                break;
            case 4:
                ArrayList<Integer> case4 = new ArrayList<Integer>();
                for (int i = a; i <= b; i += c) { // a부터 b까지 c 간격으로
                    case4.add(num_list[i]);
                }
                answer = case4.stream().mapToInt(Integer::intValue).toArray();
                break;
        }
        
        return answer;
    }
}