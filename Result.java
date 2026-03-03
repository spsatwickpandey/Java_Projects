import java.util.*;

public class Result {
    public static List<Integer> ana_gr(String txt, String pat) {
        List<Integer> result = new ArrayList<>();
        int txtLen = txt.length(), patLen = pat.length();
        if (txtLen < patLen) return result;

        int[] patCount = new int[256], windowCount = new int[256];

        for (int i = 0; i < patLen; i++) {
            patCount[pat.charAt(i)]++;
            windowCount[txt.charAt(i)]++;
        }

        for (int i = patLen; i < txtLen; i++) {
            if (Arrays.equals(patCount, windowCount))
                result.add(i - patLen);
            windowCount[txt.charAt(i)]++;
            windowCount[txt.charAt(i - patLen)]--;
        }

        if (Arrays.equals(patCount, windowCount))
            result.add(txtLen - patLen);

        return result;
    }
}
