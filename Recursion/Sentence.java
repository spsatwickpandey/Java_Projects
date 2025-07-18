import java.util.*;

public class Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); 
        String[][] arr = new String[n][];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine().split("\\s+");
        }

        ArrayList<String> result = new ArrayList<>();
        generateCombinations(arr, 0, "", result);

        for (String s : result) {
            System.out.println(s.trim());
        }
    }

    public static void generateCombinations(String[][] arr, int row, String current, ArrayList<String> result) {
        if (row == arr.length) {
            result.add(current);
            return;
        }

        for (String word : arr[row]) {
            generateCombinations(arr, row + 1, current + word + " ", result);
        }
    }
}