package generals;

public interface AI2 {

    //void walk();
    void run();

    default void aiMDefault() {
        System.out.println("from generals.AI2 MDefault");
    }
}
