public class recursion_sum {
    public static void printsum(int i,int n,int sum){
        if(i==n){
            sum += i;
            System.out.print(sum);
            return;
        }
        sum += i;
        printsum(i+1, n, sum);
    }
    public static void main(String args[]){
        int i=1,n=5,sum=0;
        printsum(i,n,sum);
    }
}
