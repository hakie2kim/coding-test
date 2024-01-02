import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // arr 중 존재하는 2의 인덱스를 indice에 추가
        ArrayList<Integer> indice = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2)
                indice.add(i);
        }
        
        /* 인덱스의 사이즈에 따라 케이스를 분류
           인덱스의 사이즈가 0 또는 1이 아닐 경우는 모두 같은 경우 */
        int[] answer = {};
        switch(indice.size()) {
            case 0:
                answer = new int[]{-1};
                break;
            case 1:
                answer = new int[]{2};
                break;
            default:
                answer = Arrays.copyOfRange(arr, indice.get(0), indice.get(indice.size()-1)+1);
                break;
        }
        return answer;
    }
}
