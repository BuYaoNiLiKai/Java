package learn06Abstract;

import com.oracle.deploy.update.UpdateInfo;

import java.util.ArrayList;
import java.util.Random;

public class Temp {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println(list);
        list.clear();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println(list);
    }
}
