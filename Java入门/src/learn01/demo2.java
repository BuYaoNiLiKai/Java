package learn01;

public class demo2 {
    public static void main(String[] args) {
        //动语态初始化
        int []a=new int[3];
        //静态初始化
        int []array=new int[]{5,15,25};
  System.out.println(a.length);
  //省略形式
        int []arrA={13,15,16};
        for(int i=0;i<arrA.length;i++)
        {
            System.out.println(arrA[i]);
        }

    }
}
