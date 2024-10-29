// public class Static_member_calling {
//     //Declaration of a static method
//     static void fun1(){
//         System.out.println("B");
//     }
//     static void fun2(){
//         System.out.println("C");
//     }

//     public static void main(String args[]){
//         System.out.println("A");
//         //Calling static method
//         fun1();
//         fun2();
//     }
// }


/**
 * Static_member_calling
 */
class Area {
    static void fun1(){
        System.out.println("Area 1");
    }
    static void fun2(){
        System.out.println("Area 2");
    }
    
}
public class Static_member_calling {


    public static void main(String args[]){
        System.out.println("A");
        Area.fun1();
        Area.fun2();
    }
}
