import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 1. Set을 만든다.
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        
        for (int std : reserve) {
            resSet.add(std);
        }
        
        for (int std : lost) {
            // 여벌 체육복을 갖고 온 학생이 도난당한 경우
            if (resSet.contains(std)) {
                resSet.remove(std); // 다른 학생에게 빌려줄 수 없음
            } else {
                lostSet.add(std);
            }
        }
        
        // 2. 여벌 체육복을 기준으로 도난당한 학생에게 빌려준다.
        for (int std : resSet) {
            if (lostSet.contains(std-1))
                lostSet.remove(std-1);
            else if (lostSet.contains(std+1))
                lostSet.remove(std+1);
        } 
        
        // 3. 체육 시간에 참여할 수 있는 학생
        return n - lostSet.size();
    }
}