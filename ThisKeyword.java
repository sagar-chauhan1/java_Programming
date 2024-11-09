class ThisK{
    ThisK(){
        System.out.println("ThisK()");
    }
    ThisK(int r){
        this();
        System.out.println(r);
    }
}

public class ThisKeyword {
    public static void main(String args[]){
        ThisK k1 = new ThisK(5);
    }
}
