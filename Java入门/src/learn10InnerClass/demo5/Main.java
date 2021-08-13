package learn10InnerClass.demo5;

public class Main {
    public static void main(String[] args) {

        MyInterfaceImpl myInterface=new MyInterfaceImpl();
        myInterface.method();
        MyInterface myInterface1=new MyInterface() {
            @Override
            public void method() {
                System.out.println("哈哈哈哈哈");
            }
        };
        myInterface1.method();
    }
}
