package learn02ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<6;i++){
            int number = random.nextInt(33) + 1;
            list.add(number);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
