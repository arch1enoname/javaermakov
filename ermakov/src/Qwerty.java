public class Qwerty {
    String stringField;

    public Qwerty(String stringField) {
        this.stringField = stringField;
    }

    public int cacheTest() {
        System.out.println("original method");
        return 42;
    }
}
