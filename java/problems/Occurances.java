package problems;

public class Occurances {

    // asdfgfabdlkhgjabdredyabcop

    public static void main(String[] args) {
        String str  = "asdfgfabdlkhgjabdredyabcopa";
        String[] arr  = str.split("abd");

        int count = 0;
        String strToFind = "abd";
        int lastIndex = 0;
        while(lastIndex!=-1) {
            lastIndex = str.indexOf(strToFind, lastIndex);

            if(lastIndex != -1) {
                count++;
                lastIndex += strToFind.length();
            }
        }
        System.out.println(count);


    }
}
