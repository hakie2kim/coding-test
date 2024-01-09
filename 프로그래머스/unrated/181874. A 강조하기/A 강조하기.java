class Solution {
    public String solution(String myString) {
//         char[] answer = myString.toCharArray();
        
//         for (int i = 0; i < answer.length; i++) {
//             if (answer[i] == 'a') {
//                 answer[i] -= 32; // 'a' = 97, 'A' = 65
//             } else if (answer[i] != 'A' && 65 <= answer[i] && answer[i] <= 90) {
//                 answer[i] += 32;
//             } 
//         }
        
//         return new String(answer);
        
        return myString.toLowerCase().replace('a', 'A');
    }
}