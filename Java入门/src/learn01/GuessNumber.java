package learn01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int num;
        int i=1;
        int goal =new Random().nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        System.out.println("游戏开始!");
        while(i<=10)
        {
            System.out.println("请输入一个1~100的整数:");
            num=sc.nextInt();
            if(num>goal){
                System.out.println("大了");
            }
            if(num<goal){
                System.out.println("小了");
            }
            if(num==goal){
                System.out.println("恭喜你,猜中了!");
                break;
            }
            i++;
        }
        System.out.println("游戏结束,答案是"+goal);
    }
}
