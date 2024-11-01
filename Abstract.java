// Abstract class
abstract class Abst1{
    void f1(){
        System.out.println("parent function 1 executed.");
    }
    // Abstract method (does not have a body)
    abstract void f2();
    Abst1(){
        System.out.println("parent's Constructor.");
    }
}
class Abst2 extends Abst1{
    void f3(){
        System.out.println("child function 1 executed.");
    }
    void f2(){
        // The body of f2() is provided here
        System.out.println("The body of f2()");
    }
    Abst2(){
        System.out.println("child's Constructor.");
    }

}

public class Abstract {
    public static void main(String args[]){
        Abst2 a1 = new Abst2();
        a1.f2();
        a1.f1();
        a1.f3();
    }
}
