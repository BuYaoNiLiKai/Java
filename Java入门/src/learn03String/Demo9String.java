package learn03String;

import java.util.Scanner;

public class Demo9String {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        count(str);
    }
    public static  void count(String str){
        byte[] array=str.getBytes();
        int num=0;
        int small=0;
        int big=0;
        int other=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=65&&array[i]<=90){
                big++;
            }
            else if(array[i]>=97&&array[i]<=122){
                small++;
            }
           else if(array[i]>=48&&array[i]<=57){
                num++;
            }
           else other++;
        }
        System.out.println("大写字母"+big+"个");
        System.out.println("小写字母"+small+"个");
        System.out.println("数字"+num+"个");
        System.out.println("其他字符"+other+"个");

    }
}
