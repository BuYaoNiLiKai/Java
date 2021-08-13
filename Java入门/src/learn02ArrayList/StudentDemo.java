package learn02ArrayList;

import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {

        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("赵丽颖",18));
        list.add(new Student("高圆圆",28));
        list.add(new Student("杨幂",30));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"  "+list.get(i).getAge());
        }
    }
}
