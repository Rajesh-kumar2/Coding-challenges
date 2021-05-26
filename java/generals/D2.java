package generals;

public class D2 extends D1{

    public static void main(String[] args) {
        D2 d2 = new D2();
        D1 d1 = new D1();
        D1 d = new D2();

        D1.Inner n = d2.new Inner();
        System.out.println(n.getId());
        D1.Inner n1 = d1.new Inner();
        System.out.println(n1.getId());
        D1.Inner n2 = d.new Inner();
        System.out.println(n2.getId());

    }
}










