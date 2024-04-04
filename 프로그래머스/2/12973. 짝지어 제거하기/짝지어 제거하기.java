import java.util.*;

class Solution
{    
    public int solution(String s)
    {        
        Stack<Character> sStack = new Stack<>();
        
        for (char letter : s.toCharArray()) {
            if (sStack.isEmpty()) { // 스택이 비었다면
                sStack.push(letter);
            } else {
                if (sStack.peek() == letter) { // 연속된 짝인 경우
                    sStack.pop(); // 스택에 있는 원소 제거
                } else {
                    sStack.push(letter);
                }
            }
                
        }

        return sStack.isEmpty() ? 1 : 0;
    }
}