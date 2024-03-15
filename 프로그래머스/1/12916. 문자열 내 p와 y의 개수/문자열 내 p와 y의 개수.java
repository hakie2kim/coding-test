class Solution {
    boolean solution(String s) {      
        int pCnt = 0;
        int yCnt = 0;
        
        for (char letter : s.toCharArray()) {
            if (letter == 'p' || letter == 'P')
                pCnt++;
            
            if (letter == 'y' || letter == 'Y')
                yCnt++;
        }

        return pCnt == yCnt;
    }
}