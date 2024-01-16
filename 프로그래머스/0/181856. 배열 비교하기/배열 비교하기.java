import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }

        return answer;
        
//         // 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
//         if (arr1.length > arr2.length) {
//             return 1;
//         } else if (arr1.length < arr2.length) {
//             return -1;
//         // 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
//         } else {
//             int arr1Sum = 0;
//             int arr2Sum = 0;
            
//             for (int num : arr1) {
//                 arr1Sum += num;
//             }
            
//             for (int num : arr2) {
//                 arr2Sum += num;
//             }
            
//             if (arr1Sum > arr2Sum) {
//                 return 1;
//             } else if (arr1Sum < arr2Sum) {
//                 return -1;
//             }
//         }
        
//         return 0;
    }
}