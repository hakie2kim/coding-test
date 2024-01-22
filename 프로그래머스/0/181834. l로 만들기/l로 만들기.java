class Solution {
    public String solution(String myString) {
//         StringBuilder sb = new StringBuilder("");
        
//         for (char letter : myString.toCharArray()) {
//             // 알파벳 char는 뒤로 갈수록 숫자가 커짐
//             if (letter < 'l') { 
//                 sb.append("l");
//             } else {
//                 sb.append(letter);
//             }
//         }
        
//         return sb.toString();
        return myString.replaceAll("[a-l]", "l");
    }
}