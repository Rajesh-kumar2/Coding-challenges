package reader;

public class SetImpl {

    boolean[] arr;

    public SetImpl() {
        this.arr = new boolean[10];
    }

    public void add(int n) {
        arr[n] = true;
    }

    public static void main(String[] args) {
        String str = "ababaa";
        System.out.println(LexicographicalMaxString(str));
    }

    static String LexicographicalMaxString(String str)
    {
        String mx = "";
        for (int i = 0; i < str.length(); ++i) {
            if (mx.compareTo(str.substring(i)) <= 0) {
                mx = str.substring(i);
            }
        }

        return mx;
    }
}
