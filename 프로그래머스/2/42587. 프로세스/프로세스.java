import java.util.*;

class Process {
    int priority;
    int location;
    
    Process(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 1. Queue 만들기
        List<Process> processes = new ArrayList<>();
        int i = 0;
        for (int priority : priorities) {
            processes.add(new Process(priority, i++));
        }
        
        // 2. 하나씩 꺼내서 처리
        while (!processes.isEmpty()) {
            Process curr = processes.remove(0);
            
            // 우선 순위가 높은 다른 프로세스가 있으면
            if (processes.stream().anyMatch(p -> curr.priority < p.priority))
                processes.add(curr);
            else { // 작업이 처리 되면
                answer++;
                if (curr.location == location)
                    break;
            }    
        }
            
        return answer;
    }
}