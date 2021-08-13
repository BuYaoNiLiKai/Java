package learn07Interface;
/*
接口就是多个类的公共规范
接口是一种引用数据类型,最重要的内容就是其中的：抽象方法
如何定义一个接口的格式:
public interface 接口名称{
}
接口使用步骤:
1.接口不能直接使用,必须有一个"实现类"来实现接口
格式:
public class 实现类名称 implements 接口名称{
       //...
}

2.接口的实现类 必须覆盖重写(实现)接口中 所有 的抽象方法
3.创建进行使用  不能直接new 接口!!!!
 */
public class Demo1Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl inter=new MyInterfaceAbstractImpl();
        inter.method1();
        inter.method2();
        inter.method3();
        inter.method4();
    }
}
