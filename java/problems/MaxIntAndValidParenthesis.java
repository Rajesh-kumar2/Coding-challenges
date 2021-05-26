package problems;

import java.io.*;
import java.util.*;
import java.util.Stack;

public class MaxIntAndValidParenthesis {

    public static String lx(String str) {
        String mx = "";
        for(int i = 0 ; i < str.length(); i++){
            if(mx.compareTo(str.substring(i))<=0) {
                mx = str.substring(i);
            }
        }
        return mx;
    }

    static int extractMaximum(String str)
    {
        int num = 0, res = 0;

        // Start traversing the given string
        for (int i = 0; i<str.length(); i++)
        {
            // If a numeric value comes, start converting
            // it into an integer till there are consecutive
            // numeric digits
            if (Character.isDigit(str.charAt(i)))
                num = num * 10 + (str.charAt(i)-'0');
            else
            {
                res = Math.max(res, num);
                num = 0;
            }
        }
        return res;
    }

    public static boolean isValid(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character>  stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)) {
                char top = stack.isEmpty()? '#' : stack.pop();
                if (top != map.get(c)) {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws FileNotFoundException {
        /*int[] arr = {9,3,9,3,9,7,9};
        String a = Arrays.stream(arr).boxed().map(String::valueOf).collect(Collectors.joining(""));
        System.out.println(a);*/

       /* String str = "100klh564abc365bg";
        System.out.println(extractMaximum(str)); */

       /* int in = 123456;
        String st = Integer.toString(in);
        StringBuilder sb = new StringBuilder();
        for(int i = st.length()-1 ; i >=0; i--) {
            sb.append(st.charAt(i));
        }
        System.out.println(Integer.parseInt(sb.toString()));*/

        String str = "{[]})";
        System.out.println(isValid(str));

    }
}
