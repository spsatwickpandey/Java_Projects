import java.util.*;

public class DirectionTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int r = sc.nextInt();

        System.out.print("Enter Columns: ");
        int c = sc.nextInt();

        int mat[][] = new int[r][c];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int rStart = 0;
        int cStart = 0;
        int direction = 0;  // 0 → Right, 1 → Down, 2 → Left, 3 → Up
        String str = "";

        List<int[]> path = new ArrayList<>();
        path.add(new int[]{rStart, cStart});  // Store initial position

        while (rStart >= 0 && rStart < r && cStart >= 0 && cStart < c) {
            if (mat[rStart][cStart] == 1) {
                direction = (direction + 1) % 4;  // Change direction
                mat[rStart][cStart] = 0;  // Flip 1 to 0 to prevent infinite loops
            }

            // Move in the current direction
            int nextR = rStart, nextC = cStart;
            if (direction == 0) nextC++;      // Move Right
            else if (direction == 1) nextR++; // Move Down
            else if (direction == 2) nextC--; // Move Left
            else if (direction == 3) nextR--; // Move Up

            // Stop if about to go out of bounds
            if (nextR < 0 || nextR >= r || nextC < 0 || nextC >= c) break;

            // Update position and store path
            rStart = nextR;
            cStart = nextC;
            path.add(new int[]{rStart, cStart});
        }

        // Determine final direction
        if (direction == 0) {
            str = "East";
        } else if (direction == 1) {
            str = "South";
        } else if (direction == 2) {
            str = "West";
        } else if (direction == 3) {
            str = "North";
        }

        // Print results
        System.out.println("Exit Point: (" + rStart + ", " + cStart + ") in the " + str + " direction");
        System.out.println("Number of cells visited: " + path.size());
        System.out.println("Path Followed: " + Arrays.deepToString(path.toArray()));
        
        sc.close();
    }
}