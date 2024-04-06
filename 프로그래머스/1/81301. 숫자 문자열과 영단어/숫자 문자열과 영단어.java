class Solution {
    private String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public int solution(String s) {      
        for (int num = 0; num < numbers.length; num++) {
            s = s.replace(numbers[num], num+"");
        }
        
        return Integer.parseInt(s);
    }
}