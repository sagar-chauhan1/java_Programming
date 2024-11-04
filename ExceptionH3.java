//throw keyword
public class ExceptionH3 {
    public static void main(String args[]){
        int cd=10000;
        int wd=12000;
        // int wd=2000;
        try{
            if(cd<wd){
                throw new ArithmeticException("Insufficient Balance.");
            }
            cd = cd-wd;
            System.out.println("Transaction Successful");
            System.out.println("Current Balance is: "+cd);
        }
        catch(ArithmeticException e1){
            System.out.println(e1.getMessage());
            System.out.println("Current Balance is : "+cd);
        }
        
    }
}
