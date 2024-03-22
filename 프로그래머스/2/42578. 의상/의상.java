import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        // 옷을 종류 별로 구별
        Map<String, List<String>> clothesByKinds = new HashMap<>();
        
        for (String[] clothe : clothes) {
            String kind = clothe[1];
            String name = clothe[0];
            
            // 종류 별 처음이 아닌 옷을 넣는 경우
            if (clothesByKinds.containsKey(kind))
                clothesByKinds.get(kind).add(name);
            // 종류 별 처음으로 옷을 넣는 경우
            else
                clothesByKinds.put(kind, new ArrayList<>(List.of(name)));
        }
        
        // System.out.println(clothesByKinds);
        
        // 종류 별로 한 가지 옷만 입는 경우
        for (List<String> sortedClothes: clothesByKinds.values()) {
            answer += sortedClothes.size();
        }
        
        if (clothesByKinds.keySet().size() == 1)
            return answer;
        
        // 종류 별로 옷을 조합해 입는 경우
        int cntByKinds = 1;
        for (List<String> sortedClothes: clothesByKinds.values()) {
            cntByKinds *= sortedClothes.size();
        }
        answer += cntByKinds;
        
        return answer;
    }
}