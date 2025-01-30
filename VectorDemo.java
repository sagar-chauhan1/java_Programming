import java.util.*;

public class VectorDemo {
    
    public static void main(String args[]){
        
        Vector v1 = new Vector();
        v1.addElement(1);
        v1.addElement(2);
        v1.addElement(3);
        v1.addElement(4);

        System.out.println("check the deta "+v1.contains(3));
        System.out.println("check the callection "+v1.containsAll(v1));
        System.out.println("index deta "+v1.elementAt(3));
       Integer arry[] = new Integer[4];
       v1.copyInto(arry);
       for(int i=0;i<arry.length;i++){
        System.out.print(arry[i]);
       }
       System.out.println();
       Vector<Integer> clone = (Vector<Integer>)v1.clone();
       System.out.println("cloned Vector "+clone);
       System.out.println("comper Vector to clone "+v1.equals(clone));
       v1.addAll(clone);
       
       System.out.println("after add all "+v1);
       System.out.println("capacity "+v1.capacity());
       System.out.println(v1.firstElement());
       System.out.println(v1.lastElement());
       
       v1.clear();
       
    }
}
