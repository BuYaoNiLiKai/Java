package learn07Interface.demo1;

public interface MyInterface {
    public  abstract  void method();
    public default void  methodDefault(){
        System.out.println("默认方法执行");
    }
}
