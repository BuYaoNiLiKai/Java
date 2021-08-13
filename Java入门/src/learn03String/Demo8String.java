package learn03String;

public class Demo8String {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        String  str=my_toString(arr);
        System.out.println(str);
    }
    public static String my_toString(int[] arr){

     String str="[";
        for (int i = 0; i < arr.length; i++) {
            str+="word"+arr[i];
            if(i!=arr.length-1)str+="#";
        }
        str+="]";
        return str;
    }
}
