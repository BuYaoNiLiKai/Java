package learn04Arrays;

import java.util.Arrays;

public class Demo4ArraysPractice {
    public static void main(String[] args) {
       String str="auhfda75sdgd";
        System.out.println(str);
        System.out.println("====排序后====");
       char[] array=str.toCharArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("====逆序后====");
        int i=0;
        int j=array.length-1;
        char ch;
       while(i<=j)
       {
           ch=array[j];
           array[j]=array[i];
           array[i]=ch;
           i++;
           j--;
       }
        System.out.println(Arrays.toString(array));
    }
}
