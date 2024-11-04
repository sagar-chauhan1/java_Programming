// throws keyword
import java.io.*;
public class ExceptionH4 {
    public static void main(String args[]) throws IOException //Exception
    {   
        System.out.println("a");
        throw new IOException();
    }
}


//Exception Handling is  used to handle the runtime errors or exceptions that occur during the execution of a program.

// import java.io.*;

// public class ExceptionH4{
//     public static void main(String args[]){
//         System.out.println("a");
//         try{
//             throw new IOException(); //null
//         }
//         catch(IOException e1){
//             System.out.println(e1.getMessage());
//         }
//     }
// }

