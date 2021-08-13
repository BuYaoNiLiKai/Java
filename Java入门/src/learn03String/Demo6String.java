package learn03String;

/*
String 当中与转换相关的常用方法有:

public char[] toCharArray():将当前字符串拆分为字符数组作为返回值
public byte[] getBytes:获得当前字符串地城的字节数组
public String replace(CharSequence oldString,CharSequence  newString):
将所有出现的老字符串替换成为新的字符串,返回替换之后的结果新字符串

 */
public class Demo6String {
    public static void main(String[] args) {
        char[] chars="HelloWorld".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("===========");

        byte[] bytes="abcde".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String str1="How do you do?";
        String str2=str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
    }
}
