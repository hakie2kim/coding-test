import java.util.*;
import java.io.*;

class Point {
    int x, y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    int getX() {
        return x;
    }
    
    int getY() {
        return y;
    }
    
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

class Main {
    static int N;
    static Point[] points;
    
    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken()); // 점의 개수
        
        points = new Point[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            points[i] = new Point(x, y);
        }
        // System.out.println(Arrays.toString(points));
        
        Arrays.sort(points, (a, b) -> {
            // y좌표가 같으면 x좌표가 증가하는 순서로 정렬
            if (a.getY() == b.getY())
                return a.getX() - b.getX();
            // y좌표가 다르면 y좌표가 증가하는 순서로 정렬
            else
                return a.getY() - b.getY();
        });
        // System.out.println(Arrays.toString(points));
        
        for (int i = 0; i < N; i++) {
            System.out.println(points[i].getX() + " " + points[i].getY());
        }
        
        bw.close();
        br.close();
    }
}