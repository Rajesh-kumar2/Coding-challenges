package generals;

import java.util.PriorityQueue;

public class StandImpl {

    public static void main(String[] args) {
       int[] arr = {11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45};

        PriorityQueue<Integer> pq = new PriorityQueue();
        for (int i = 0; i < 6; i++) {
            pq.add(arr[i]);
        }
        for(Integer in: pq) {
            System.out.println(in);
        }
        for (int i = 6; i < arr.length ; i++) {
            if(pq.peek() > arr[i]) {
                continue;
            }
            pq.poll();
            pq.add(arr[i]);
        }
        System.out.println(pq);
    }
}
