package generals;

import java.util.Arrays;
import java.util.Scanner;

public class Interview {

    public static int[] productExceptSelf(int[] nums) {
        int[] t1 = new int[nums.length];
        int[] t2 = new int[nums.length];
        int[] result = new int[nums.length];

        t1[0] = 1;
        t2[nums.length-1] = 1;

        for(int i = 0; i < nums.length-1; i++) {
            t1[i+1] = nums[i] * t1[i];
        }
        System.out.println("t1: " + Arrays.toString(t1));

        for(int i =  nums.length-1; i > 0; i--) {
            t2[i-1] = nums[i] * t2[i];
        }
        System.out.println("t2: " + Arrays.toString(t2));
        for(int i = 0; i < nums.length; i++) {
            result[i] = t1[i] * t2[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        //System.out.println(Math.abs(-5));
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
