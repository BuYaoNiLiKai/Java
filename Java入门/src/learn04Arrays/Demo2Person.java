package learn04Arrays;
/*
特点:当第一次用到本类时:静态代码执行唯一的一次
静态内容总是优于非静态,所以静态代码块比构造方法先执行.

静态代码块的典型用途,
用来一次性地对静态成员变量进行赋值.
 */
public class Demo2Person {
    public static void main(String[] args) {
        Person p=new Person();
        Person p1=new Person();
    }
}
