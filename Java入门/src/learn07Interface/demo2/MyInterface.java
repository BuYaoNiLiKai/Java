package learn07Interface.demo2;

public interface MyInterface {
    public default  void methodDefaultA(){
        System.out.println("默认方法A");
  methodCommon();
    }
    public default  void methodDefaultB(){
        System.out.println("默认方法B");
        methodCommon();
    }
    public  default  void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
