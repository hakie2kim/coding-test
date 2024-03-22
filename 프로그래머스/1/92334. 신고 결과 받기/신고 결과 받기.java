import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 1. 중복 신고 제거
        Set<String> distinctReports = new HashSet<>();
    
        for (String rep : report) {
            distinctReports.add(rep);
        }
        
        // 2. 신고 당한 사람, 신고자
        Map<String, List<String>> reportedIdByReporters = new HashMap<>();

        for (String idAndReport : distinctReports) {
            String[] idAndReportArr = idAndReport.split(" ");
            
            String reporterId = idAndReportArr[0];
            String reportedId = idAndReportArr[1];
            
            if (reportedIdByReporters.containsKey(reportedId)) {
                reportedIdByReporters.get(reportedId).add(reporterId);
            } else {
                reportedIdByReporters.put(reportedId, new ArrayList<>(List.of(reporterId)));
            }

        }
        // System.out.println(reportedIdByReporters);
        
        // 3. 신고한 사용자
        Map<String, Integer> reporterByReportedCnts = new HashMap<>();
        for (List<String> reporters : reportedIdByReporters.values()) {
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    reporterByReportedCnts.put(reporter, reporterByReportedCnts.getOrDefault(reporter, 0) + 1);    
                }
            }
        }
        // System.out.println(reporterByReportedCnts);
        
        // 4. 신고한 사용자한테 보고된 건 수
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++)
            answer[i] = reporterByReportedCnts.getOrDefault(id_list[i], 0);
        
        return answer;
    }
}