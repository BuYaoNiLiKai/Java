package learn04Arrays;

public class StudentDemo {
    public static void main(String[] args) {
        Student one=new Student("郭靖",19);
        Student two=new Student("黄蓉",21);
        System.out.println("学号"+one.getId()+",姓名:"+one.getName()+",年龄:"+one.getAge()+"岁");
        System.out.println("学号"+two.getId()+",姓名:"+two.getName()+",年龄:"+two.getAge()+"岁");
        System.out.println("===========");
        one.setRoom("教室101");
        System.out.println("姓名:"+one.getName()+",年龄:"+one.getAge()+"岁"+",教室"+one.getRoom());
        System.out.println("姓名:"+two.getName()+",年龄:"+two.getAge()+"岁"+",教室"+two.getRoom());
    }
}
