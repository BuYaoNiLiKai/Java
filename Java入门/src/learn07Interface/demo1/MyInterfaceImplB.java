package learn07Interface.demo1;

public class MyInterfaceImplB implements MyInterface{
    @Override
    public void method() {
        System.out.println("B类实现method");
    }

    @Override
    public void methodDefault() {
        System.out.println("B类实现默认方法的重写");
    }
}
