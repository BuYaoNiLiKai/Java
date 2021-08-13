package learn04Arrays;
/*
计算在-10.8到539之间绝对值大于6或者小于2.1的整数有多少个
 */
public class Demo6MathPractice {
    public static void main(String[] args) {
        double min=-10.8;
        double max=5.9;
        int count=0;
        for(int i=(int) min;i<max;i++)
        {

            if(Math.abs(i)>6||Math.abs(i)<2.1)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("共有"+count+"个");

    }
}
