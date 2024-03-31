class Solution {
//     private int totalFromOneToA(int a) {
//         return a * (a + 1) / 2;
//     }
    
//     // 15 표현을 위 함수로 한다면
//     // totalFromOneToA(x) - totalFromOneToA(y)
//     // 5 - 0
//     // 6 - 3
//     // 8 - 6
//     // 15 - 14
    
//     public int solution(int n) {
//         int answer = 0;
        
//         for (int i = n; i >= 0; i--) {
//             for (int j = 0; j <= i; j++) {
//                 if (totalFromOneToA(i) - totalFromOneToA(j) == n) {
//                     answer++;
//                     break;
//                 }
                
//                 if (totalFromOneToA(i) - totalFromOneToA(j) <= 0)
//                     break;
//             }
//         }
        
//         return answer;
//     }
    
    public int solution(int n) {
        int answer = 0;
          
        for (int a = 1; a <= n; a++) {
            int sum = 0;
            
            for (int b = a; b <= n; b++) {
                sum += b;
                
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }          
        
        return answer;
    }
}