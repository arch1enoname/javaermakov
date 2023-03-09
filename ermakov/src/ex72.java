@Two(first = "first", second = 12)
@Cache
public class ex72 {
    @ToString
    @Default(Entity.class)
    int field;
    @Invoke
    void method(){}
}
