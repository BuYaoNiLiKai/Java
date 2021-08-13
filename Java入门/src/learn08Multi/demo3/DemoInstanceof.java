package learn08Multi.demo3;

public class DemoInstanceof {
    public static void main(String[] args) {

        checkAnimal(new Dog());
        System.out.println("==================");
        checkAnimal(new Cat());
    }
    public static void checkAnimal(Animal  animal){
        if(animal instanceof Dog)
        {
            Dog dog=(Dog) animal;
            dog.eat();
            dog.watchHouse();
            System.out.println("汪汪汪");
        }
        else if(animal instanceof Cat){
            Cat cat=(Cat)animal;
            cat.eat();
            cat.catchMouse();
            System.out.println("喵喵");
        }
    }
}
