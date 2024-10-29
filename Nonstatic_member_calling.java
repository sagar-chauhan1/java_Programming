class area1{
    //Declaration of a static method
    void fun1(){
        System.out.println("Non-static method");
    }
    void fun2(){ 
        System.out.println("x");
    }
}
public class Nonstatic_member_calling {
    public static void main(String args[]){
        int a=20;
        System.out.println(a);
        // Calling non static method
        area1 e1 = new area1();
        e1.fun1();
        e1.fun2();
    }
}
