class Solution {
    public String solution(String my_string, int[] indices) {
        
        StringBuffer answer = new StringBuffer(my_string);
        
        // deleteCharAt 바로 사용하면 전체 인덱스 개수가 변경됨
        for (int index : indices) {
            answer.setCharAt(index, '0'); 
        }
        
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == '0')
                answer.deleteCharAt(i--); // char 하나가 삭제되면 검사할 인덱스가 하나 건너 뛰어짐
        }
        
        return new String(answer);
    }
}