class Solution {
    public int solution(int[] num_list) {
        int answer = 0; int repeat = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) { // 요소의 값이 1이 될 때까지 반복
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                } else {
                    num_list[i]--;
                    num_list[i] /= 2;
                }
                repeat++;
            }
        }
        
        return repeat;
    }
}
