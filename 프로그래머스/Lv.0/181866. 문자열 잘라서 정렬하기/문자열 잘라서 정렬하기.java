import java.util.*;

class Solution {
    public String[] solution(String myString) {
//         String[] myStringArr = myString.split("x");
        
//         ArrayList<String> myStringArrWithoutEmptyStr = new ArrayList<>();
        
//         for (String myStr : myStringArr) {
//             if (!myStr.isEmpty())
//                 myStringArrWithoutEmptyStr.add(myStr);
//         }
        
//         Collections.sort(myStringArrWithoutEmptyStr);
        
//         return myStringArrWithoutEmptyStr.toArray(String[]::new);
        
        return Arrays.stream(myString.split("x")).filter(str -> !str.isEmpty()).sorted().toArray(String[]::new);
    }
}