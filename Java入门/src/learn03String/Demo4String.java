package learn03String;
/*
String 当中与获取相关的常用方法有:

public int length():获取长度
public String concat(String str):将当前字符串和str连接
public char charAt(int index):获取指定索引位置的字符
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置,如果没有返回-1值
 */
public class Demo4String {
    public static void main(String[] args) {
        int length="asddfwffyssrdsfgsd".length();
        System.out.println("字符串的长度是:"+length);
        String str1="Hello";
        String str2="World";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //获取指定索引位置的单个字符
        char ch="Hello".charAt(1);
        System.out.println("在1号索引位置的字符是:"+ch);

        //查找索引
        String original="HelloWorld";
        int index=original.indexOf("llo");
        System.out.println(index);
        System.out.println(original.indexOf("abc"));
    }
}
