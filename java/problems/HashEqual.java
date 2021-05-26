package problems;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashEqual {
    private int id;  private String name; private int age;

    public HashEqual(int id, String name, int age) {
        this.id = id;  this.name = name;  this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashEqual hashEqual = (HashEqual) o;
        return id == hashEqual.id && age == hashEqual.age && Objects.equals(name, hashEqual.name);
    }
    @Override
    public int hashCode() {
        //return 41;
        return Objects.hash(id, name, age);
    }
    public static void main(String[] args) {
        HashEqual hs = new HashEqual(1,"abc", 10);
        HashEqual hs1 = new HashEqual(1,"abc", 10);

        System.out.println(hs.equals(hs1));
        System.out.println("hs: " + hs.hashCode());
        System.out.println("hs1: " + hs1.hashCode());

        Set<HashEqual> set = new HashSet<>();
        set.add(hs);
        set.add(hs1);

        System.out.println("Size of the set: " + set.size());
    }
    // output without implementing hashcode() and equals()
    //false
    //hs: 1854731462
   // hs1: 20132171
}
