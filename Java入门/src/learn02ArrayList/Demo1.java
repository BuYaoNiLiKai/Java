package learn02ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        Person []pArray =new Person[3];
        Person one =new Person("迪丽热巴",18);
        Person two=new Person("古力娜扎",28);
        Person three=new Person("马儿扎哈",38);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        pArray[0]=one;
        pArray[1]=two;
        pArray[2]=three;
        System.out.println(pArray[0]);
        System.out.println(pArray[1]);
        System.out.println(pArray[2]);
    }
}
