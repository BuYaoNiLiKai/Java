package learn02ArrayList;

import java.util.ArrayList;

/*
如果希望向集合ArrayList当中存储基本类型数据,必须使用基本类型对应的"包装类"
基本类型    包装类(引用类型,包装类都位于java.lang包下)
byte        Byte
short       Short
int         Integer
long        Long
float       Float
double      Double
char        Character
boolean     Boolean

从JDK 1.5+开始,支持自动装箱,自动拆箱.
自动装箱:基本类型-->包装类型
自动拆箱:包装类型-->基本类型
 */
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(30);
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
