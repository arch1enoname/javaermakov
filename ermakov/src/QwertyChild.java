public class QwertyChild extends Qwerty{
    public QwertyChild(String stringField) {
        super(stringField);
    }

    String cacheStringField;
    int cache;

    public int cacheTest() {
        if (cacheStringField.equals(super.stringField)) {
            return cache;
        }
        cacheStringField = super.stringField;
        System.out.println("original method");
        cache = 42;
        return 42;
    }
}
