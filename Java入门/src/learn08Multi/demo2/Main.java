package learn08Multi.demo2;
/*
访问成员变量的两种形式

1.直接通过对象名称访问成员变量,看等号左边是谁,优先是谁,没有则向上找
2.间接通过成员方法访问成员变量,看该方法属于谁,优先用谁,没有则向上找

成员变量:编译看左边,运行还看左边
成员方法:编译看左边,运行看右边
变量看左边,方法看右边
 */
public class Main {
    public static void main(String[] args) {

        Father father=new Son();
        System.out.println(father.num);
        father.showNumber();
    }
}
