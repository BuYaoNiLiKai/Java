package learn04Arrays;
/*
一旦使用static修饰成员方法,那么这就成为了静态方法,静态方法不属于对象,而是属于类的

如果没有static关键字,那么必须首先创建对象,然后通过对象,才能使用它。

无论是成员变量,还是成员方法,如果有了static都推荐使用类名称进行调用
静态变量:类名称:静态变量
静态方法:类名称.静态方法()

注意事项:
1.静态只能直接访问静态,不能直接访问非静态
 */
public class Demo1 {
    public static void main(String[] args) {
            MyClass obj=new MyClass();//首先创建对象
        //然后才能使用没有static关键字的内容
            obj.method();

            //对于静态方法来说,可以通过对象名进行调用,也可以直接通过类名来调用
            obj.methodStatic();//正确,不推荐,这种写法在编译之后也会被javac翻译成为"类名称,静态方法名"
            MyClass.methodStatic();//正确,推荐

            //对于本类当中的静态方法,可以省略类名称
            myMethod();
            Demo1.myMethod(); //完全等效
    }
    public static void myMethod(){
        System.out.println("自己的方法");
    }
}
