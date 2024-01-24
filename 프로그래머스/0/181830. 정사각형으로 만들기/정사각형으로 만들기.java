class Solution {
    public int[][] solution(int[][] arr) {
        int size = arr.length >= arr[0].length ? arr.length : arr[0].length; // 행
        
        int[][] answer = new int[size][size];
        
        for (int i = 0; i < arr.length; i++) {
            
            // int row = arr[i].length; // 열
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
//                 if (column > j) { // 행의 수가 열의 수보다 더 많다면
//                     answer[i][j] = 0;
//                 } else {
                    
//                 }
            }
        }
        
        return answer;
    }
}