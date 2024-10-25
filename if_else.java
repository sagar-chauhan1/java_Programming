// import java.util.Scanner;

// public class if_else {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age>18){
//             System.out.print("Adult");
//         }
//         else{
//             System.out.print("Not Adult");
//         }
//     }
// }

// import java.util.Scanner;

// public class if_else {

//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int num= sc.nextInt();
//         if(num%2==0){
//             System.out.print("Even");
//         }
//         else {
//             System.out.print("Odd");
//         }
//     }
// }

import java.util.Scanner;

public class if_else{

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b){
                System.out.print("Equal");
            }
            else {
                if(a>b){
                    System.out.print("a is greater");
                }
                else{
                    System.out.print("b is greater");
                }
            }      
    }
}

