class Demo{
    private int x;
    private static int y;
void fun1(){
    x=20;
    y=10;
}
void fun2(){
    System.out.println(x);
    System.out.println(y);
}
void fun3(){
    y=45;
}
}
public class Private_specified {
    
    public static void main(String args[]){
        Demo e1 = new Demo();
        Demo e2 = new Demo();
        e1.fun1();
        e2.fun3();
        e1.fun2();
        e2.fun2();
    }
}
