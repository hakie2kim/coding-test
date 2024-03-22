import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
//         int answer = 0;
        
//         // 옷을 종류 별로 구별
//         Map<String, List<String>> clothesByKinds = new HashMap<>();
        
//         for (String[] clothe : clothes) {
//             String kind = clothe[1];
//             String name = clothe[0];
            
//             // 종류 별 처음이 아닌 옷을 넣는 경우
//             if (clothesByKinds.containsKey(kind))
//                 clothesByKinds.get(kind).add(name);
//             // 종류 별 처음으로 옷을 넣는 경우
//             else
//                 clothesByKinds.put(kind, new ArrayList<>(List.of(name)));
//         }
        
//         // System.out.println(clothesByKinds);
        
//         // 종류 별로 한 가지 옷만 입는 경우
//         for (List<String> sortedClothes: clothesByKinds.values()) {
//             answer += sortedClothes.size();
//         }
        
//         if (clothesByKinds.keySet().size() == 1)
//             return answer;
        
//         // 종류 별로 옷을 조합해 입는 경우
//         int cntByKinds = 1;
//         for (List<String> sortedClothes: clothesByKinds.values()) {
//             cntByKinds *= sortedClothes.size();
//         }
//         answer += cntByKinds;
        
//         return answer;
        
        // 1. 옷을 종류 별 개수로 구분
        Map<String, Integer> clothesByKinds = new HashMap<>();
        
        for (String[] clothe : clothes) {
            String kind = clothe[1];
            clothesByKinds.put(kind, clothesByKinds.getOrDefault(kind, 0) + 1);
        }
        
        System.out.println(clothesByKinds);
        
        // 2. 입지 않는 경우를 포함해 종류 별로 입을 수 있는 조합을 구함
        int cntByKinds = 1;
        for (Integer clothesCntByKind: clothesByKinds.values()) {
            cntByKinds *= (clothesCntByKind + 1);
        }
        
        // 3. 이무것도 입지 않는 경우를 제외
        return cntByKinds - 1;
    }
}