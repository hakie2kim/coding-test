class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder("");
        
        String[] morses = {".-", "-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; // a부터 z
        
        for (String morse : letter.split(" ")) { // letter의 각 morse에 대해
            for (int i = 0; i < morses.length; i++) {
                if (morse.equals(morses[i]))
                    sb.append((char) (i + 97)); // 'a'는 ascii로 97
            }
        }
        
        return sb.toString();
    }
}