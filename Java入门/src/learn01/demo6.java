package learn01;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        int a,b;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        int []ret=calculate(a,b);
        System.out.println("sum:"+ret[0]);
        System.out.println("avg:"+ret[1]);
    }
    public static int [] calculate(int x,int y)
    {
        int []ret=new int[2];
        ret[0]=x+y;
        ret[1]=(x+y)/2;
        return ret;
    }

}
