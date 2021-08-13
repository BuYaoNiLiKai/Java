package learn07Interface.demo1;

public class Main {
    public static void main(String[] args) {
        MyInterfaceImplA A=new MyInterfaceImplA();
        MyInterfaceImplB B=new MyInterfaceImplB();
        A.method();
        A.methodDefault();
        System.out.println("============");
        B.method();
        B.methodDefault();
    }
}
