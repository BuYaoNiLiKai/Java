package learn07Interface.demo4;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();
    public default void method(){
        System.out.println("A类的默认方法");
    }
}
