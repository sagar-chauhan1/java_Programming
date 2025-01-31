import java.util.*;

public class HashSetDemo {
    public static void main(String args[]){
        // by defulat capacity 16 and load factor 0.75
        HashSet h1 = new HashSet( 13,0.40f);
        h1.add(1);
        h1.add(2);
        h1.add(3);
        h1.add(4);

         // Convert HashSet to LinkedList
        LinkedList<Integer> list = new LinkedList<>(h1);

        ListIterator<Integer> li = list.listIterator();
        
        while(li.hasNext()){
           int i = li.next();
           System.out.print(i);
        }
        System.out.println();
        while(li.hasPrevious()){
            int j = li.previous();
            System.out.print(j);
        }
    }
}
