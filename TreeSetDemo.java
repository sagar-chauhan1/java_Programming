import java.util.TreeSet;

public class TreeSetDemo {
    
    public static void main(String[] args) {

        TreeSet t1 = new TreeSet();
        t1.add(32);
        t1.add(22);
        t1.add(36);
        t1.add(41);
        t1.add(31);

        //SortedSet function
        System.out.println(t1.first());
        System.out.println(t1.last());
        System.out.println(t1.headSet(36));
        System.out.println(t1.tailSet(36));
        System.out.println(t1.subSet(22,50));
        
        //NavigableSet function

        System.out.println(t1.ceiling(0));
        System.out.println(t1.floor(88));
        System.out.println(t1.higher(32));
        System.out.println(t1.lower(42));
        System.out.println(t1.pollFirst());
        System.out.println(t1.pollLast());
        System.out.println(t1);
    }
}
