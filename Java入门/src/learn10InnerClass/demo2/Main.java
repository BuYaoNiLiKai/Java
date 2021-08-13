package learn10InnerClass.demo2;

public class Main {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer().new Inner();
        obj.method();
    }
}
