package learn06Abstract.Practice;

import java.util.ArrayList;

public class Manager extends  User{
    public Manager(){}

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer>  send(int totalMoney,int count){
        ArrayList<Integer> list=new ArrayList<>();
        int leftMoney=super.getMoney();
        if(leftMoney<totalMoney){
            System.out.println("余额不足");
            return list;
        }
        else{
            int avg=totalMoney/count; //
            int mod=totalMoney%count; //零钱
            for(int i=0;i<count;i++)
            {
                if(i==count-1)list.add(avg+mod);
               else list.add(avg);
            }
            super.setMoney(leftMoney-totalMoney);
            return  list;
        }
    }
}
