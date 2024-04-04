import java.util.*;

public class Main
{
    private static String[] board;
    
    private static int getSolution(int startRow, int startColumn) {
        String[] orgBlkBoardRow = {"BWBWBWBW", "WBWBWBWB"}; // 블랙 체스판의 각 열 패턴
        
        int blackSol = 0;
        for (int i = startRow; i < startRow+8; i++) {
		    for (int j = startColumn; j < startColumn+8; j++) {
		        if (board[i].charAt(j) != orgBlkBoardRow[i%2].charAt(j-startColumn))
		            blackSol++;
		    }
		}
		
		// 화이트 체스판의 최소 비용 = (전체 개수 - 블랙 체스판의 최소 비용)
		return Math.min(blackSol, 64 - blackSol);
    }
    
	public static void main(String[] args) {
		// input 받기
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		sc.nextLine();
		
		board = new String[row];
		for (int i = 0; i < row; i++) {
		    board[i] = sc.nextLine();
		}
		
		int sol = Integer.MAX_VALUE;
		// 체스판 쪼개기, 시작 시점
		for (int i = 0; i <= row - 8; i++) {
		    for (int j = 0; j <= column - 8; j++) {
		        int curSol = getSolution(i, j);
		        
		        if (curSol < sol) 
		            sol = curSol;
		    }
		}
		
		System.out.println(sol);
		sc.close();
	}
}
