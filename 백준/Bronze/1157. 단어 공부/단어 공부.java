import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 알파벳별 counting
        int[] count = new int[26];
        String word = br.readLine().toUpperCase();
        int maxCnt = 0; char maxChar = '?';
        for (char letter : word.toCharArray()) {
            int idx = letter-'A';
            
            // 2. 가장 많이 사용한 알파벳 업데이트
            count[idx]++;
            if (count[idx] > maxCnt) {
                maxCnt = count[idx];
                maxChar = letter;
            // 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?
            } else if (count[idx] == maxCnt) { 
                maxChar = '?';
            }
        }
        
        System.out.println(maxChar);
    }
}