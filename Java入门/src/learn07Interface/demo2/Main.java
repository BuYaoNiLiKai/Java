package learn07Interface.demo2;

public class Main {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface=new MyInterfaceImpl();
        myInterface.methodDefaultA() ;
        System.out.println("=============");
        myInterface.methodDefaultB() ;
        System.out.println("=============");
        myInterface.methodCommon();
    }
}
