package learn10InnerClass.demo4;
/*
局部内部类如果想要访问所在方法的局部变量,那么这个局部变量必须是【有效的final的】。

备注:从Java 8+ 开始,只要局部变量事实不变,那么final关键字可以省略

原因:
1.new出来的对象在堆中。
2.局部变量是跟着方法的,在栈内存当中。
3.方法运行结束之后,立刻出栈,局部变量就立刻消失。
4.但是new出来的对象会在堆当中持续存在,直到垃圾回收
 */
public class MyOuter {
    public void method(){
         int num=10;
//         num=20;
         class Inner{
            public void methodInner(){
                System.out.println( num);
            }
        }
    }
}
