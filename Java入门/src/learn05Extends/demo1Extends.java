package learn05Extends;
/*
在继承的关系中,"子类就是一个父类",也就是说,子类可以被当成父类看待

定义子类的格式
public class 子类名称 extends 父类名称{
}
 */
public class demo1Extends {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.method();

        Assitant a=new Assitant();
        a.method();
    }
}
