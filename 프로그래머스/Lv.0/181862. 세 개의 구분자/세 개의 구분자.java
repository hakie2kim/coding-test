import java.util.*;

class Solution {
    public String[] solution(String myStr) {
//         String[] myStrSplitted = myStr.split("[abc]", -1);
        
//         ArrayList<String> myStrSplittedWithoutEmpty = new ArrayList<String>();  
//         for (String str : myStrSplitted) {
//             if (!str.isEmpty())
//                 myStrSplittedWithoutEmpty.add(str);
//         }
        
//         return myStrSplittedWithoutEmpty.isEmpty() ? new String[]{"EMPTY"} : myStrSplittedWithoutEmpty.toArray(String[]::new);
        
        String[] myStrSplittedWithoutEmpty = Arrays.stream(myStr.split("[abc]", -1)).filter(str -> !str.isEmpty()).toArray(String[]::new);
        return myStrSplittedWithoutEmpty.length == 0 ? new String[]{"EMPTY"} : myStrSplittedWithoutEmpty;
    }
}