import geometry.Line;
import geometry.Point;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilityClass {
    static List<Field> fieldCollection(Object object) throws InstantiationException, IllegalAccessException {
        List<Field> fields = new ArrayList<>();
        Object obj = object;

        while (obj.getClass().getSuperclass() != Object.class) {
            fields.addAll(Arrays.asList(obj.getClass().getDeclaredFields()));
            obj = obj.getClass().getSuperclass().newInstance();
        }

        fields.addAll(Arrays.asList(obj.getClass().getDeclaredFields()));

        return fields;
    }

    static void lineConnector(Line line1, Line line2) throws NoSuchFieldException, IllegalAccessException {
        Point point = new Point(10, 10);

        Field field = line1.getClass().getDeclaredField("end");
        field.setAccessible(true);
        field.set(line1, point);

        field = line2.getClass().getDeclaredField("start");
        field.setAccessible(true);
        field.set(line2, point);

    }

    static void validate(Object object, Class cls) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            method.invoke(null, object);
        }
    }

    static <T> T cache(T obj) throws NoSuchFieldException, IllegalAccessException {

        Field field = obj.getClass().getDeclaredField("stringField");
        field.setAccessible(true);
        return obj;
    }
}
