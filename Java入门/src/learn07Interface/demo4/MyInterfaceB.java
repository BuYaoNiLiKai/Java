package learn07Interface.demo4;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default void method(){
        System.out.println("B类的默认方法");
    }
}
