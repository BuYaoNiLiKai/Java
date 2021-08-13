package learn01;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入次数:");
        int num=in.nextInt();
        print_hello(num);
    }
    public static void print_hello(int num)
    {
        for(int i=0;i<num;i++)
            System.out.println("hello world   " + (i+1));
    }
}
