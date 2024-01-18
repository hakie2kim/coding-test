import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] top3Stds = new int[3];
        Map<Integer, Integer> stdRanks = new TreeMap<>(); // 점수, 번
        
        for (int i = 0; i < rank.length; i++) {
            stdRanks.put(rank[i], i);
        } // 값을 넣으면서 key의 값(순위)대로 자동 정렬됨
        
        int[] top3AttendedStds = new int[3];
        int i = 0;
        for (int stdIdx : stdRanks.values()) {
            if (attendance[stdIdx]) { // 참석한 경우 학생 번 기록
                top3AttendedStds[i++] = stdIdx;
            }
                
            if (i == 3) { // 3순위까지 결정
                break;
            }
        }

        return 10000 * top3AttendedStds[0] + 100 * top3AttendedStds[1] + top3AttendedStds[2];
    }
}