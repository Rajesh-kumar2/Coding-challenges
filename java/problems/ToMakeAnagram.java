package problems;

public class ToMakeAnagram {
    public static int NUMBER_LETTERS = 26;

    public static int numberNeeded(String first, String second) {
        int[] charCount1 = getCharCounts(first);
        int[] charCount2 = getCharCounts(second);
        return getDelta(charCount1, charCount2);
    }

    private static int getDelta(int[] charCount1, int[] charCount2) {
       if(charCount1.length != charCount2.length) return  -1;
       int delta = 0;
        for (int i = 0; i < charCount1.length; i++) {
            int diff  = Math.abs(charCount1[i] - charCount2[i]);
            delta +=diff;
        }
        return delta;
    }

    private static int[] getCharCounts(String str) {
        int[] charCount = new int[NUMBER_LETTERS];
        for (int i =0; i < str.length(); i ++) {
            char c = str.charAt(i);
            int offset  = (int) 'a';
            int code = c - offset;
            charCount[code]++;
        }
        return charCount;
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "billion";

        System.out.println(numberNeeded(s1, s2));

    }
}
