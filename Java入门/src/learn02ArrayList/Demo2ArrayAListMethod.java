package learn02ArrayList;
import java.util.ArrayList;
/*
ArrayList当中的常用方法有:

public boolean add(E e): 向集合当中添加元素,参数的类型和泛型一致.
备注:对于ArrayList集合来说,add添加动作一定成功,所以返回值可用可不用。
但是对于其他集合来说,不一定成功
public E get(int index): 从集合当中获取元素,参数是索引编号,返回值就是对应位置的元素.
public E remove(int index):从集合当中删除元素,参数是索引编号,返回值是被删除掉的元素.
public int size():获取集合的尺寸长度,返回值是集合中包含的元素个数
 */
public class Demo2ArrayAListMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        boolean success;
        success=list.add("赵又廷");
        System.out.println("添加是否成功:"+success);
        list.add("高圆圆");
        list.add("贾乃亮");
        list.add("李小璐");
        System.out.println(list);
        System.out.println(list.size());
        String s=list.get(2);
        System.out.println("第二号索引值:"+s);
        String whoRemoved = list.remove(3);
        System.out.println("删除的是:"+whoRemoved);
        System.out.println("=======删除后======");
        System.out.println(list);
        System.out.println(list.size());
    }
}
