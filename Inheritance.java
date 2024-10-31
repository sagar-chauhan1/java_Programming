class Nokia1{
    void f1(){
        System.out.println("parent function 1 executed.");
    }
    void f2(){
        System.out.println("Parent function 2 executed.");
    }
    Nokia1(){
        System.out.println("Parent's constructor executed.");
    }
}
class Nokia2 extends Nokia1{
    void f3(){
        System.out.println("child function 1 executed.");
    }
    Nokia2(){
        System.out.println("child's constructor executed.");
    }
}

public class Inheritance {
        public static void main(String args[]){
            Nokia2 n = new Nokia2();
            n.f1();
            n.f2();
            n.f3();
    }
}
