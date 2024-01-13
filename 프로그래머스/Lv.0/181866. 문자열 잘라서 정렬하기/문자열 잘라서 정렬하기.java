import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // System.out.println(Arrays.toString(myString.split("x")));
        String[] myStringArr = myString.split("x");
        
        ArrayList<String> myStringArrWithoutEmptyStr = new ArrayList<>();
        
        for (String myStr : myStringArr) {
            if (!myStr.isEmpty())
                myStringArrWithoutEmptyStr.add(myStr);
        }
        
        Collections.sort(myStringArrWithoutEmptyStr);
        
        return myStringArrWithoutEmptyStr.toArray(String[]::new);
    }
}