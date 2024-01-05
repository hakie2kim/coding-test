class Solution {
    public int solution(int[] num_list) {
        int evenIndicesTotal = 0; int oddIndicesTotal = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (i%2==0) {
                evenIndicesTotal += num_list[i];
            } else {
                oddIndicesTotal += num_list[i];
            }
        }
        
        return evenIndicesTotal > oddIndicesTotal ? evenIndicesTotal : oddIndicesTotal; // Math.max(evenIndicesTotal, oddIndicesTotal) 사용하면 가독성 좋음
    }
}