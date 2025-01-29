import java.util.LinkedList;

public class LinkedListDemo1 {
    
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        
        //linkedList add
        list.addFirst(1);
        //collection add
        list.add(4);
        //list add
        list.add(0,9);
        list.addLast(2);

        System.out.println(list);
        System.out.println("get first element: "+list.getFirst());
        System.out.println("get last element: "+list.getLast());

        System.out.println("remove first element: "+list.removeFirst());
        System.out.println("remove last element: "+list.removeLast());

        System.out.println(list);
    }
}
