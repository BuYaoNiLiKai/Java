package learn01;

public class PersonDemo {
    public static void main(String[] args) {
        Person  p=new Person();
       p.show();
      // p.age=18; 直接访问private内容,错误写法
       p.setAge(20);
       p.name="赵丽颖";
       p.show();

    }
}
