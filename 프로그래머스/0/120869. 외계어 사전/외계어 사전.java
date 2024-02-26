import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {        
        int[] spellCnts = new int[spell.length];
        
        for (String vocab : dic) {
            String[] splittedVocab = vocab.split("");
            
            Arrays.sort(splittedVocab); Arrays.sort(spell); // 정렬해야 한 번, 모두 사용됐는지 비교 가능
            if (Arrays.equals(splittedVocab, spell))
                return 1;
        }
        
        return 2;
    }
}