package learn05Extends;
/*
再父子类的继承关系当中,如果成员变量重名,则创建对象时,访问有两种方式

直接通过子类对象访问成员变量
    等号左边是谁,就优先用谁,没有则向上找。
间接通过成员方法访问成员变量:
    该方法属于谁,就优先用谁,没有则向上找。
 */
public class demo2Extends {
    public static void main(String[] args) {
        Father father=new Father();
        System.out.println(father.numFather);
        System.out.println("===========");

        Son  son=new Son();
        System.out.println(son.numSon);
        System.out.println(son.numFather);
        System.out.println("===========");

        System.out.println(son.num);
        System.out.println("===========");

        son.methodSon();
        son.methodFather();
    }
}
