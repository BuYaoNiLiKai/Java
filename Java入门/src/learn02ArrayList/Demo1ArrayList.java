package learn02ArrayList;

import java.util.ArrayList;

public class Demo1ArrayList {
    public static void main(String[] args) {
//        ArrayList<Person>
        ArrayList<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list.size());
        System.out.println(list);
    }
}

