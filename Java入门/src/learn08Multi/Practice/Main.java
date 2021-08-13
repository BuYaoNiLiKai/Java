package learn08Multi.Practice;

public class Main {
    public static void main(String[] args) {
        Desktop desktop=new Desktop();
        desktop.powerOn();

        //准备鼠标供电脑使用
        Usb usb=new Mouse();//多态方法,父指向子
        desktop.UseDevice(usb);



        Keyboard keyboard=new Keyboard();//没有使用多态方法
        //方法参数是Usb类型,传递进去的是实现类对象
        desktop.UseDevice(keyboard );//正确写法!也发生了向上转型
//        desktop.UseDevice(new Keyboard());

        desktop.powerOff() ;

        System.out.println("=================");
        method(10.0);  //正确写法 double-->double
        method(20);   //正确写法 int-->double
        int a=30;
        method(a);   //正确写法 int-->double
    }
    public static void method(double num){
        System.out.println(num);
    }
}
