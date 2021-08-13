package learn06Abstract.Graphic;

public class Main {
    public static void main(String[] args) {
        triangle t =new triangle(10,5);
        rectangle r=new rectangle(5,8);
        square s=new square(4);
        t.getArea();
        r.getArea();
        s.getArea();
    }
}
