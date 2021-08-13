package learn04Arrays;

public class Person {
    private int age;
    static {
        System.out.println("静态方法执行");
    }
    Person(){
        System.out.println("构造方法执行");
    }
}