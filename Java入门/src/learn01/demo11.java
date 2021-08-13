package learn01;

import java.util.Random;
/*
使用:
获取一个随机的int数字,(范围是int所有范围,有正负两种)
获取一个随机的int数字(参数代表了范围,左闭右开右开区间) iny num=random.nextInt(3)
实际上代表的是含义是,[0,3),也就是0-2
 */
public class demo11 {
    public static void main(String[] args) {
        Random random=new Random();
      int []array=new int[10];
      for(int i=0;i<10;i++)
      {
          array[i]= random.nextInt(100);
      }
      for(int i=0;i<10;i++)
      {
          System.out.println(array[i]+" ");
      }
      double x=9.7756;
      int y=(int) x;
        System.out.println(y);
    }
}
