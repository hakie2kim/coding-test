import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] myStringSplitted = myString.split("x", myString.length()); // myString.length()를 통해 limit을 줘야 함
        
        ArrayList<Integer> myStringSplittedLength = new ArrayList<Integer>();
        for (String str : myStringSplitted) {
            myStringSplittedLength.add(str.length());
        }
        
        return myStringSplittedLength.stream().mapToInt(Integer::intValue).toArray();
    }
}