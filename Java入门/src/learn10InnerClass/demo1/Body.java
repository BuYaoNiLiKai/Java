package learn10InnerClass.demo1;

public class Body {
    private String name;
    public class Heart{
        public void beat(){
            System.out.println("我叫"+name);
            System.out.println("砰砰砰!");
        }
    }
    public void  method(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
