class Solution {
    public String solution(String new_id) {
        StringBuilder answer = new StringBuilder("");
        
        // 1단계
        new_id = new_id.toLowerCase();
        System.out.println(new_id);
        
        // 2단계
        for (int i = 0; i < new_id.length(); i++) {
            char letter = new_id.charAt(i);
            
            if (Character.isAlphabetic(letter) || Character.isDigit(letter) || letter == '-' || letter == '_' || letter == '.')
                answer.append(letter);
        }
        System.out.println(answer.toString());
        new_id = answer.toString();
        
        // 3단계
        // new_id = new_id.replaceAll(".+", ".");
        while (new_id.indexOf("..") != -1)
            new_id = new_id.replace("..", ".");
        System.out.println(new_id);
        
        // 4단계
        if (!new_id.isEmpty() && new_id.charAt(0) == '.')
            new_id = new_id.substring(1, new_id.length());
         
        if (!new_id.isEmpty() && new_id.charAt(new_id.length() - 1) == '.')
            new_id = new_id.substring(0, new_id.length()-1);
        
        System.out.println(new_id);
        
        // 5단계
        if (new_id.isEmpty())
            new_id = "a";
        
        // 6단계
        if (new_id.length() >= 16)
            new_id = new_id.substring(0, 15);
        
        if (!new_id.isEmpty() && new_id.charAt(new_id.length() - 1) == '.')
            new_id = new_id.substring(0, new_id.length()-1);
        
        // 7단계
         answer = new StringBuilder(new_id);
        
        if (1 <= new_id.length() && new_id.length() <= 2) {
            while (answer.toString().length() != 3)
                answer.append(new_id.charAt(new_id.length() - 1));
        }
            
        return answer.toString();
    }
}