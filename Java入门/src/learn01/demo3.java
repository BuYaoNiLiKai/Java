package learn01;

public class demo3 {
    public static void main(String[] args) {
        int arrayA[]=new int[3];
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("=============");
        arrayA[1]=20;
        arrayA[2]=30;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("=============");
        int [] arrayB=arrayA;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("=============");
        arrayB[1]=100;
        arrayB[2]=200;
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
    }
}
