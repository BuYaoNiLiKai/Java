package learn07Interface.demo4;
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("实现A类方法");
    }

    @Override
    public void methodCommon() {
        System.out.println("hello world");
    }

    @Override
    public void method() {
        System.out.println("覆盖AB类的默认方法");
    }


    @Override
    public void methodB() {
        System.out.println("实现B类方法");
    }
}
