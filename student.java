class student {
    int rollno;
    String name;
    float fee;
    student(int rollno,String name,float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display(){System.out.println(rollno + " " + name + " " + fee);}
}
public class EXP19 {
    public static void main(String args[]){
        student s1 = new student(001,"Mudit",5000f);
        student s2 = new student(002,"Rachit",6000f);
        s1.display();
        s2.display();
  }
}
