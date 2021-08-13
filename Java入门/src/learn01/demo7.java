package learn01;

import java.util.Arrays;

public class demo7 {
    public static void main(String[] args) {
        int []array={1,2,4,5,7,12};
        //要求打印格式[1,2,4,5,6];
        int i;
        System.out.print("[");
        for(i=0;i<array.length;i++)
        {
            if(i==array.length-1)
            {
                System.out.print(array[i]+"]");
            }
            else
            {
                System.out.print(array[i]+", ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
