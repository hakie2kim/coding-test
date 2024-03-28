import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        // A 오름차순 정렬, B 내림차순으로 정렬한 각각의 곱의 합은 최소
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length-i-1];
        }

        return answer;
    }
}