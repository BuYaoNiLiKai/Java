package learn01;
/*
通常情况下,一个类不能直接使用,需要根据类 创建一个对象,才能使用
如果成员变量没有进行赋值,那么将会有一个默认值,规则和数组一样
1.导包(位于同一个包下,可以省略)
2.创建
3.使用
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student a=new Student();
        a.learn();
        System.out.println(a.name);
        System.out.println(a.age);
    }
}
