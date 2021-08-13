package learn05Extends;

public class Zi extends Fu{
    int num=20;
    public void method(){
        int num=30;
        System.out.println("局部变量:"+num);
        System.out.println("子类成员变量:"+this.num);
        System.out.println("父类成员变量:"+super.num);
    }
}
