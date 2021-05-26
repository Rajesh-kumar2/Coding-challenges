package problems;

public class SwapNAscii {

    private static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        swap(i, j);
        //System.out.println("i = " + i + ", j = " + j);
        char c = 'a';
        int val = 'c';
        int num = 105;
        //System.out.println(val);
        char ch = (char) num;
        System.out.println(ch);
    }
}
