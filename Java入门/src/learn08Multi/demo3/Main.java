package learn08Multi.demo3;
/*
向上转型一定是安全的,没有问题的,正确的。但是也有一个弊端
对象一旦发生向上转型为父类,那么就无法调用子类原本保持有的内容
 */
public class Main {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();

        //无法调用cat类特有的方法
//        animal.catchMouse();

        //向下转型,进行还原动作
        Cat cat =(Cat)animal;
        cat.catchMouse();

        //下面是错误的向下转型
        //本来new的时候是一只猫,现在非要当成狗
        //!!!!猫不吃屎
//        System.out.println("========");
//        Dog dog=(Dog)animal;
    }
}
