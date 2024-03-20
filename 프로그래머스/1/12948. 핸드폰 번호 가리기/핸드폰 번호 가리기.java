class Solution {
    public String solution(String phone_number) {
        char[] phone_number_arr = phone_number.toCharArray();
        
        // 0 ~ 뒤 네 자리 수를 제외한 인덱스까지
        for (int i = 0; i < phone_number_arr.length - 4; i++) {
            phone_number_arr[i] = '*';
        }
        
        return new String(phone_number_arr);
    }
}