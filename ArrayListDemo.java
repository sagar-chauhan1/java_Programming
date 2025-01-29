import java.util.*;;

public class ArrayListDemo {
    
    public static void main(String args[]){
        ArrayList l1 = new ArrayList();
        l1.add(0,1);
        l1.add(1,2);
        l1.add(2,3);
        l1.add(3,10);
        l1.add(4, 5);
        l1.add(5, 6);
        

        System.out.println("set "+l1.set(1, 10));
        System.out.println("get "+l1.get(1));
        System.out.println("ArrayList size "+l1.size());
        System.out.println("check index "+l1.indexOf(10));
        System.out.println("check lastindex "+l1.lastIndexOf(10));
        System.out.println("remove element "+l1.remove(2));

        System.out.println(l1+" ");

        List l2 = l1.subList(1, 4);
        System.out.println("subList "+l2+" ");
    }
}
