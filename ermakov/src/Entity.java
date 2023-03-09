import java.lang.reflect.Field;

public class Entity {
    @Override
    public String toString() {
        String s = "";
        s += this.getClass();
        s += " {";

        try {
            Object obj = this.getClass().newInstance();
            while (obj.getClass().getSuperclass()!=Object.class) {
                Field[] fields = obj.getClass().getDeclaredFields();

                for (Field field : fields) {
                    s += field.getName();
                    s += " = ";
                    try {
                        s += field.get(obj);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                    s += ", ";
                }
                obj = obj.getClass().getSuperclass().newInstance();
                fields = obj.getClass().getDeclaredFields();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }




        return s;
    }
}
