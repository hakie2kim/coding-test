class Position {
    int row;
    int column;
    
    Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    String getFinger(String hand, Position left, Position right) {
        if (column == 0)
            return "L";
        else if (column == 2)
            return "R";
        else {
            // 두 손가락과의 거리가 같으면 왼손잡이는 왼손 오른손잡이는 오른손
            String finger = hand.equals("left") ? "L" : "R";
            
            if (getDist(left) > getDist(right)) {
                finger = "R";
            } else if (getDist(left) < getDist(right)) {
                finger = "L";
            }
            
            return finger;
        }      
    }
    
    int getDist (Position pos) {
        return Math.abs(this.row - pos.row) + Math.abs(this.column - pos.column);
    }
}

class Solution {
    static Position left, right, num;
    
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        // 1. 왼손 오른손 처음 위치 초기화
        left = new Position(3, 0);
        right = new Position(3, 2);
        
        for (int number : numbers) {
            // 눌러야 할 숫자의 위치 초기화
            num = new Position((number-1) / 3, (number-1) % 3);
            if (number == 0) {
                num = new Position(3, 1);
            }
            
            // 3. 정해진 손가락을 answer에 넣고 손가락 위치 이동
            String finger = num.getFinger(hand, left, right);
            answer.append(finger);
            if (finger.equals("L"))
                left = num;
            else
                right = num;  
        }
        
        return answer.toString();
    }
}