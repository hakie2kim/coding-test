class Solution {
    public int solution(String binomial) {
        String[] aopb = binomial.split(" ");
        
        Integer a = Integer.parseInt(aopb[0]);
        Integer b = Integer.parseInt(aopb[2]);
        
        switch(aopb[1]) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;                
        }
        
        return 0;
    }
}