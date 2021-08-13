package learn01;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        //普通使用方式
//      Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        System.out.println(num);


        //匿名对象的方式
//        int num=new Scanner(System.in).nextInt();
//        System.out.println(num);

        //使用一般写法传入参数
//        Scanner sc=new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象进行传参
//        methodParam(new Scanner(System.in));
//        Scanner sc=new Scanner(System.in);
        Scanner sc=methodReturn();
        int num=sc.nextInt();
        System.out.println(num);

    }
    public static void methodParam(Scanner sc){
        int num=sc.nextInt();
        System.out.println("输入的是:"+num);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
