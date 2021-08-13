package learn03String;
/*
字符串的特点:
1.字符串的内容永不可变.【重点】
2.正是因为字符窜不可改变,所以字符串是可以共享使用的
3.字符串效果上相当于是char[]字符数组,但是底层原理是byte[]字节数组

 创建字符串的常见3+1种方式
 三种构造方法
 public String():创建一个空白字符串,不含任何内容
 public String(char[] array):根据字符数组的内容,来创建对应的字符串
 public String(byte[] array):根据字节数组的内容,来创建对应的字符串
一种直接创建
String str="Hello"
注意:直接写上双引号,就是字符串对象
 */
public class Demo1String {
    public static void main(String[] args) {
            //使用空参构造
        String str1=new String();
        System.out.println("第一个字符串:"+str1);

        char[] charArray={'A','B','C','D'};
        String str2=new String(charArray);
        System.out.println("第二个字符串:"+str2);

        byte[] bytearray={97,98,99,100};
        String str3=new String(bytearray);
        System.out.println("第三个字符串:"+str3);

        String str4="hello";
        System.out.println("第四个字符串:"+str4);
    }
}
