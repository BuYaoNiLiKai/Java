package learn06Abstract.Graphic;

public class triangle extends graphic {
    int x;
    int y;

    public triangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void getArea() {
        System.out.println(x*y*0.5);
    }
}
