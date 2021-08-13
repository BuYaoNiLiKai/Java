package learn06Abstract.Graphic;

public class rectangle extends  graphic{
    int x;
    int y;

    public rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void getArea() {
        System.out.println(x*y);
    }
}
