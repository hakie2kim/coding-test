import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. 정렬함
        Arrays.sort(phone_book);
        
        // 2. 인접한 두 전화번호만 비교
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].indexOf(phone_book[i]) == 0) // 접두사인 경우 prefix의 index는 0임
                return false;
        }
        
        return true;
    }
}