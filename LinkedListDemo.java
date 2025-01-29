import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    
    public static void main(String args[]){
        ArrayList l1 = new ArrayList();
        l1.add(0,1);
        l1.add(1,2);
        l1.add(2,3);
        l1.add(3,10);
        l1.add(4, 5);
        l1.add(5, 6);
        System.out.println(l1);

        LinkedList l2 = new LinkedList(l1);
        l2.addFirst(30);
        l2.addLast(40);

        System.out.println(l2);

        System.out.println("get frist element "+l2.getFirst());
        System.out.println("get last element "+l2.getLast());

        System.out.println("remove first element "+l2.removeFirst());
        System.out.println("remove last element "+l2.removeLast());
        System.out.println(l2);
    }
}
