package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    static int NO_OF_CHARS = 256;

    /* function to check whether two strings
    are anagram of each other */
    static boolean areAnagram(String str1, String str2) {
        int[] count = new int[NO_OF_CHARS];

        for (int i = 0; i < str1.length() && i < str2.length(); i ++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }

    static void findAllAnagrams(String arr[], int n)
    {
        List<List<String>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> l = new ArrayList<>();
            for (int j = i + 1; j < n; j++) {
                if (areAnagram(arr[i], arr[j])) {
                    if (!l.contains(arr[i])) {
                        l.add(arr[i]);
                    }
                    l.add(arr[j]);
                }
            }
             list.add(l);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        String arr[] = {"geeksquiz", "geeksforgeeks",
                "abcd", "forgeeksgeeks",
                "zuiqkeegs"};
        int n = arr.length;
        findAllAnagrams(arr, n);
    }
}
