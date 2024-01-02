import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> indice = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2)
                indice.add(i);
        }
        
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