package generals;

public class D1 {

    private int id = 10;

    class Inner {
        int age = 20;
        public int getId() {
            return D1.this.id;
        }
        private int getId1() {
            return D1.this.id;
        }

    }

    public void m() {
        Inner in = new Inner();
        System.out.println(in.getId1());
    }
}
