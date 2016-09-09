package _q389_find_diff;

import java.util.Arrays;

/**
 * Created by tavazma on 8/31/16.
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        if (s == null)
            return t.charAt(0);
        char [] charArr1 = s.toCharArray();
        Arrays.sort(charArr1);
        char [] charArr2 = t.toCharArray();
        Arrays.sort(charArr2);
        for (int i = 0; i< charArr1.length; i++)
            if (charArr1[i]!=charArr2[i]) {
                System.out.println(charArr2[i]);
                return charArr2[i];

            }
        return charArr2[charArr2.length-1];
    }
}
