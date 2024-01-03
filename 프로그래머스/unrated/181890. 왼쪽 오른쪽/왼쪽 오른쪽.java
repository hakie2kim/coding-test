import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> answerL = new ArrayList<String>();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return answerL.stream().toArray(String[]::new);       
            }
            answerL.add(str_list[i]);
            
            if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i+1, str_list.length);
            }    
        }
        return new String[]{};
        // return answer.stream().toArray(String[]::new);   
        
        // int str_list_length = str_list.length;
        // int idxL = 0; int idxR = 0;
        
//         for (int i = 0; i < str_list_length; i++) {
//             if (str_list[i].equals("l")) {
//                 idxL = i;
//                 break;                
//             }
//         }
        
//         for (int i = 0; i < str_list_length; i++) {
//             if (str_list[i].equals("r")) {
//                 idxR = i;
//                 break;
//             }
//         }

//         if (idxL == -1 || idxR == -1 || idxL == 0 || idxR == 0 || idxL == str_list_length-1 || idxR == str_list_length-1)
//             return new String[]{};
        
//         return idxL < idxR ? Arrays.copyOfRange(str_list, 0, idxL) : Arrays.copyOfRange(str_list, idxR+1, str_list_length);
    }
}