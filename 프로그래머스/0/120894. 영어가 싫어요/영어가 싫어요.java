class Solution {
    public long solution(String numbers) {
        String[] engNums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < engNums.length; i++) {
            if (numbers.indexOf(engNums[i]) != -1) { // 숫자를 영어로 표현한 것이 존재할 때만
                numbers = numbers.replace(engNums[i], i+"");
            }
        }
             
        return Long.parseLong(numbers);
    }
}