package learn10InnerClass.demo4;
/*
public > protected > (default) > private
定义一个类的时候,权限修饰符规则
1.外部类:public /(default)
2.成员内部类 public /protected/(default)/private
3.局部内部类:什么都不能写,而且与default不同
 */
public class Outer {
    public void method(){
        class Inner{
            int num=10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner=new Inner();
        inner.methodInner();
    }
    public static void main(String[] args) {

         Outer outer=new Outer();
         outer.method();
    }
}
