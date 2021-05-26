package generals;

public interface AI {

    void run();
    default void aiMDefault() {
        System.out.println("from generals.AI MDefault");
    }

    static void aiMStatic() {
        System.out.println("from generals.AI M static");
    }

    private void aiMPrivate() {
        System.out.println("from generals.AI M private");
    }
}
