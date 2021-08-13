package learn01;

public class demo5 {
    public static void main(String[] args) {
        int []array={1,2,3,4,5,4,6,7,1};
        print(array);
    }
    public static void print(int []arr)
    {
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
