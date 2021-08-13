package learn09Final.demo1;
/*
final 关键字代表最终\不可改变的

常见的四种用法:
1.可以用来修饰一个类
2.可以用来修饰一个方法
3.还可以用来修饰一个局部变量
4.还可以用来修饰一个成员变量
 */
public class Demo1Final {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num);
        num=20;
        System.out.println(num);


        //一旦使用final用来修饰局部变量,那么这个变量就不能进行更改。
        //一次赋值,终生不变
        final int a=200;
        System.out.println(a);
//        a=20;
//        a=200

        //正确写法,只要保证有唯一一次赋值即可
        final int b;
        b=40;

        //对于基本类型来说,不可变说的是变量当中的数据不可改变
        //对于引用类型来说,不可变说的是变量当中的地址值不可改变
    }
}
