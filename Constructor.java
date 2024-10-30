class Demo{
    int x;
    int y;
    Demo(int p, int q){
        x=p;
        y=q;
        System.out.println(x);
        System.out.println(y);
    }
    Demo(){
        System.out.println("Constructor executed");
    }
}

public class Constructor {
    public static void main(String args[]){
        Demo e1 = new Demo(2,4);
        Demo e2 = new Demo();
    }
}
