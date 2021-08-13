package learn02ArrayList;
import java.util.ArrayList;
import java.util.Random;
public class Demo7 {
    public static void main(String[] args) {
        ArrayList<Integer>  list=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 20; i++) {
            int num;
            num=random.nextInt(100)+1;
            list.add(num);
        }
        System.out.println(list);
        ArrayList<Integer> listB =sort(list);
        System.out.println(listB);
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> listA){
        ArrayList<Integer> listB=new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            int num=listA.get(i);
            if(num%2==0)
                listB.add(num);
        }
        return listB;
    }
}
