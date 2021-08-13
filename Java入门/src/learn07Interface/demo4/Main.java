package learn07Interface.demo4;
/*
1.接口当中是没有静态代码块或者构造方法的
2.一个类的直接父类是唯一的,但是一个类可以同时实现多个接口.
格式:
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
//覆盖重写所有抽象方法
}
3.如果实现类所实现的多个接口当中,存在重复的 抽象 方法,那么只需要覆盖重写一次即可.
4.如果实现类没有覆盖重写所有接口当中的抽象方法,那么实现类必须是一个抽象类.
5.如果实现类所实现的多个接口当中,存在重复的 默认 方法,那么实现类一定要对冲突的默认方法进行覆盖重写.
6.一个类如果直接父类 当中的方法,和接口当中的默认方法产生了冲突,优先用父类当中的方法.
 */
public class Main {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface=new MyInterfaceImpl();
        myInterface.methodA();
        myInterface.methodB() ;
        myInterface.method();
        myInterface.methodCommon();
    }
}
