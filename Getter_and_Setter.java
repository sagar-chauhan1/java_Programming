class Student{
    private int studId;
    private String studName;
    private double studMarks;

    public void setStudId(int id){
        studId=id;
    }
    public int getStudId(){
        return studId;
    }

    public void setStudName(String name){
        studName=name;
    }
    public String getStudName(){
        return studName;
    }
    public void setStudMarks(double mark){
        studMarks=mark;
    }
    public double getStudMarks(){
        return studMarks;
    }
}
public class Getter_and_Setter {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setStudId(4);
        s1.setStudName("Sagar");
        s1.setStudMarks(80);

        int id=s1.getStudId();
        String name=s1.getStudName();
        double mark=s1.getStudMarks();

        System.out.println("Student id : "+id);
        System.out.println("Student name : "+name);
        System.out.println("Student mark : "+mark);
    }
}
