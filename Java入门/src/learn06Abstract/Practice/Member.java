package learn06Abstract.Practice;

import java.util.ArrayList;
import java.util.Random;

public class Member extends  User{
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }
    public void  receive(ArrayList<Integer> list){
        //随机抽一个红包给自己
        int index;
        Random random=new Random();
        index=random.nextInt(list.size());
        //根据索引,从集合中删除,并得到被删除的红包
        int delta=list.remove(index);

        this.setMoney(super.getMoney()+delta);
    }
}
