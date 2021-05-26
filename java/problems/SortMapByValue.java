package problems;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {

    public static void main(String[] args) {
        HashMap<String, Integer> hm
                = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByValue(hm);

        // print the sorted hashmap
        for (Map.Entry<String, Integer> en :
                hm1.entrySet()) {
            System.out.println("Key = " + en.getKey()
                    + ", Value = "
                    + en.getValue());
    }}

    /*private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.addAll(hm.entrySet());
        *//*Collections.sort(list, (i1, i2) -> {
            return i1.getValue().compareTo(i2.getValue());
        });*//*

        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> sm : list) {
            sortedMap.put(sm.getKey(), sm.getValue());
        }
        return sortedMap;
    }*/

    private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        return hm.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (i1, i2) ->i1, LinkedHashMap::new));
    }
}
