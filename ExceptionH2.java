//finally keyword
public class ExceptionH2 {
    public static void main(String args[]){
        try{
            System.out.println(5/0);
        }
        catch(NullPointerException e1){

        }
        // //Exception
        // catch(Exception e1){
        //     System.out.println("b");
        // }
        finally{
            System.out.println("This is finally");
        }
    }
}
