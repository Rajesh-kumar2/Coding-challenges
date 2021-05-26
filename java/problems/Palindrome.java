package problems;

public class Palindrome {
    // Anuragracecarrajesh
    static int resultStart;
    static int resultLength;

    public static String logestPalindrome(String str) {

        int length = str.length();
        for(int i =0; i< length; i++) {
            calculate(str, i, i);
            calculate(str, i, i+1);
        }
        return str.substring(resultStart, resultStart + resultLength);
    }

    private static void calculate(String str, int start, int end) {
        while(start>=0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;

            if(resultLength < end - start -1) {
                resultStart = start + 1;
                resultLength = end - start -1;
            }
        }
    }

    public static void main(String[] args) {
        String s = "Anuragracecarrajesh";
        System.out.println(logestPalindrome(s));
    }

}
