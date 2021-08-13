package learn04Arrays;
/*
public static double abs(double num):获取绝对值
public static double ceil(double num):向上取整
public static double floor(double num):向下取整
public static long round(double num):四舍五入
 */
public class Demo5Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("=====向上取整=====");

        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(0));
        System.out.println(Math.ceil(-2.5));
        System.out.println("=====向下取整=====");
        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(0));
        System.out.println(Math.floor(-2.5));

        System.out.println("=====四舍五入=====");
        System.out.println(Math.round(20.4));
        System.out.println(Math.round(13.6));

        System.out.println("==========");
        System.out.println(Math.PI);
    }
}
