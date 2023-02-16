import java.util.*;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            if(hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        char most = ' ';
        int count = 0;
        for(char k : hm.keySet()) {
            if(hm.get(k) > count) {
                count = hm.get(k);
                most = k;
            }
        }
        return most;        }
    }

