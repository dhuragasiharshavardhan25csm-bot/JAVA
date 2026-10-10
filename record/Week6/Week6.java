package record;

import java.util.*;
public class Week6 {
	public static void main(String args[]) {

        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        String result = s.substring(start, start + maxLength);

        System.out.println("Length: " + maxLength);
        System.out.println("Substring: " + result);
    }

	}
