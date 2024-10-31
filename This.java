class Key{
    private int x;
    private int y;
    void f1(int x, int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}

public class This {
    public static void main(String args[]){
        Key e1 = new Key();
        e1.f1(3,4);
        e1.display();
    }
}
