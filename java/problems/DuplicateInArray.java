package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateInArray {

    public static void main(String[] args) {
        int[] arr = {2,1,2};

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i])-1;
            if(arr[index] < 0 ) result.add(arr[i]);
            arr[index] = -arr[index];
        }

        System.out.println(result);
        int count[] = new int[5];
        System.out.println(Arrays.toString(count));
    }
}
