package learn02ArrayList;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马儿扎哈");
        //遍历集合 fori(自动生成)
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
