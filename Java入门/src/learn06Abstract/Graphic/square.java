package learn06Abstract.Graphic;

public class square extends  graphic{
    int x;

    public square(int x) {
        this.x = x;
    }

    @Override
    public void getArea() {
        System.out.println(x*x);
    }
}
