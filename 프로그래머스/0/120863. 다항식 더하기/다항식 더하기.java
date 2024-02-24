class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        
        int xCoeffiSum = 0;
        int constant = 0;
        for (String term : terms) {            
           if (term.contains("x")) { // x 일차항
               if (term.equals("x")) { // x인 경우
                   xCoeffiSum++;
               } else { // 그 외 예) 2x, 3x, 30x
                   xCoeffiSum += Integer.parseInt(term.substring(0, term.length()-1));
               }
           } else { // 상수항
               constant += Integer.parseInt(term);
           }
        }
        
        if (xCoeffiSum == 0 && constant == 0)
            return "0";
        else if (xCoeffiSum != 0 && constant == 0)
            return (xCoeffiSum == 1) ? "x" : xCoeffiSum + "x";
        else if (xCoeffiSum != 0 && constant != 0)
            return (xCoeffiSum == 1) ? "x + " + constant : xCoeffiSum + "x + " + constant;
        else
            return constant + "";
    }
}