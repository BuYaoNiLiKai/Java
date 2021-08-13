package learn10InnerClass.demo1;
/*
如何使用成员内部类?有两种方式:
1.间接方式:在外部类的方法当中,使用内部类;然后main只是调用外部类的方法.
2.直接方式:公式
类名称 对象名 =new 类名称
【外部类名称.内部类名称 对象名 =new 外部类名称().new 内部类名称();】
 */
public class Main{
    public static void main(String[] args) {
        Body body=new Body();
        body.method();
        System.out.println("==============");
        Body.Heart heart=new Body().new Heart();
        heart.beat();
    }
}
