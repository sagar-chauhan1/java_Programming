import java.util.*;

public class StackDemo {
    
    public static void main(String args[]){
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(23);
        s1.push(32);
        s1.push(44);

        System.out.println(s1);

        System.out.println("pop function "+s1.pop());
        System.out.println(s1);

        System.out.println("peek function "+s1.peek());
        System.out.println(s1);

        System.out.println("check the cellstion "+s1.empty());

        System.out.println("returns the 1-based position "+s1.search(10));
    }
}
