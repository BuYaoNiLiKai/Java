package learn01;
/*
方法重载与下列因素相关:
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序

方法重载与下列因素无关:
1.与参数的名称无关
2.与方法的返回值类型无关
 */
public class Demo1Overload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));

    }
    public static int sum(int a,int b){
        return a+b;
    }
    //错误写法
//    public static void sum(int x,int y){
//
//    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int  c,int d){
        return a+b+c+d;
    }
}
