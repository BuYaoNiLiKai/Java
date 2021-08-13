package learn10InnerClass.demo2;

public class Outer {
    int num=10;  //外部类的成员变量
    public class Inner{
        int num=20; //内部类的成员变量
        public void method(){
            int num=30;  //内部类的局部变量
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
