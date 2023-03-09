package ex714;

public class HumanTests {
    static void test1 (Human h) throws RuntimeException{
        if (h.age < 0 || h.age > 200) {
            throw new RuntimeException("exception in test1: age < 0 or age > 200");
        }
    }

    static void test2 (Human h) throws RuntimeException{
        if (h.name.equals("Arthur")) {
            throw new RuntimeException("name is busy");
        }
    }
}
