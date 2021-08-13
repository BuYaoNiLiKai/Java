package learn08Multi.demo2;

public class Son extends Father{
    int num=20;
    @Override
    public void showNumber(){
        System.out.println("子类number:"+num);
    }
}
