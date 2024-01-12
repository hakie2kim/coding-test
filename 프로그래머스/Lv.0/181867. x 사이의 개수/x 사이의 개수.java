import java.util.*;

class Solution {
    public int[] solution(String myString) {
// 1. If the limit n is greater than zero then the pattern will be applied at most n - 1 times, the array's length will be no greater than n, and the array's last entry will contain all input beyond the last matched delimiter.

// 2. If n is non-positive then the pattern will be applied as many times as possible and the array can have any length.

// 3. If n is zero then the pattern will be applied as many times as possible, the array can have any length, and trailing empty strings will be discarded.
        
//         String[] myStringSplitted = myString.split("x", myString.length()); // myString.length()를 통해 limit을 줘야 함
        
//         ArrayList<Integer> myStringSplittedLength = new ArrayList<Integer>();
//         for (String str : myStringSplitted) {
//             myStringSplittedLength.add(str.length());
//         }
        
//         return myStringSplittedLength.stream().mapToInt(Integer::intValue).toArray();
        
        return Arrays.stream(myString.split("x", -1)).mapToInt(str -> str.length()).toArray();
    }
}