package learn08Multi.demo1;
/*
代码当中体现多态性:父类引用指向子类对象

格式:
父类名称 对象名 =new 子类名称();
右侧子类对象被当成父类对象使用是没有问题的
一只猫被当成一只动物是没有问题的
或者:
接口名称 对象名 = new 实现类名称();
 */
public class Demo1Multi {
    public static void main(String[] args) {
        Father father=new Son();
        father.method();
        father.methodFather() ;
    }
}
