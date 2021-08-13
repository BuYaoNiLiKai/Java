package learn06Abstract;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int num;
        double money;
        ArrayList<Double> moneyList=new ArrayList<>();
        ArrayList<Integer> percentageList=new ArrayList<>();
        Random random=new Random();
        Scanner  sc=new Scanner(System.in);
        System.out.println("请输入红包个数:");
        num=sc.nextInt();
        System.out.println("请输入红包金额");
        money=sc.nextDouble();
        int i;
        int sum;
        int temp;
        int bound;
        while (true){
            sum=0;
            bound=100;
            for(i=0;i<num;i++){
                temp=random.nextInt(50)+1;
                percentageList.add(temp);
                if(i==0) bound=100-temp;
               else  bound-=temp;
                if(bound==0)break;
            }
            if(i==num-1){
                for(i=0;i<num;i++){
                    sum+=percentageList.get(i);
                }
                if(sum==100)break;
            }
            percentageList.clear();
        }
        System.out.println(percentageList);
    }
}
