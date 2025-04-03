import java.util.*;

public class SpiralMat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter Columns: ");
        int cols = sc.nextInt();
        System.out.print("Enter Row Start: ");
        int rStart = sc.nextInt();
        System.out.print("Enter Column Start: ");
        int cStart = sc.nextInt();
        
        int[][] result = spiralOrder(rows, cols, rStart, cStart);
        
        for (int[] cell : result) {
            System.out.println(Arrays.toString(cell));
        }
    }

    public static int[][] spiralOrder(int rows, int cols, int rStart, int cStart) {
        int totalCells = rows * cols;
        int[][] result = new int[totalCells][2];
        
        int[] dr = {0, 1, 0, -1}; // right, down, left, up
        int[] dc = {1, 0, -1, 0};
        
        int direction = 0, step = 1, count = 0;
        int r = rStart, c = cStart;
        
        while (count < totalCells) {
            for (int i = 0; i < 2; i++) { // Two directions per step increase
                for (int j = 0; j < step; j++) {
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[count++] = new int[]{r, c};
                    }
                    r += dr[direction];
                    c += dc[direction];
                }
                direction = (direction + 1) % 4; // Change direction
            }
            step++; // Increase step size after completing a cycle
        }
        return result;
    }
}
