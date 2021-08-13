package learn06Abstract.Practice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager("群主",100);
        Member one=new Member("成员a",0);
        Member two=new Member("成员b",0);
        Member three=new Member("成员c",0);
        manager.show();
        one.show();
        two.show();
        three.show();
        ArrayList<Integer> list=manager.send(20,3);
        one.receive(list);
        two.receive(list);
        three.receive(list);
        System.out.println("=============");
        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
