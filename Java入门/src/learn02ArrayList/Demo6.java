package learn02ArrayList;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("赵丽颖");
        list.add("杨幂");
        list.add("迪丽热巴");
        list.add("古力娜扎");
        print(list);
    }
    public static void print(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i!=list.size()-1){
                System.out.print("@");
            }
        }
        System.out.print("}");
    }
}
