package learn01;

public class demo4 {
    public static void main(String[] args) {
       int []array={1,2,3,4,5,6,7,8,9,10};
       int right = array.length-1;
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        int left = 0;
        System.out.println();
        while (left<=right)
       {
           int temp = array[left];
           array[left]=array[right];
           array[right]=temp;
           left++;
           right--;
       }
       for(int i=0;i<array.length;i++)
       {
           System.out.print(array[i]+" ");
       }
    }
}
