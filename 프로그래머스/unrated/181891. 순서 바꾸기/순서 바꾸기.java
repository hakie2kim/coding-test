import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
//         int idx = 0;
//         for (int num : Arrays.copyOfRange(num_list, n, num_list.length)) {
//             answer[idx++] = num;
//         }
        
//         for (int num : Arrays.copyOfRange(num_list, 0, n)) {
//             answer[idx++] = num;
//         }
        
       for (int i = 0; i < answer.length; i++) {
           answer[i] = num_list[(i+n)%answer.length];
       }
        
/*        
0 1 0
1 2
2 0
                
0 3 0+3%5
1 4
2 0
3 1
4 2
*/

        return answer;
    }
}