interface Printable {
    void print();
}
interface Showable extends Printable {
    void show();
}
class TestInterface implements Showable {
    public void print() {
        System.out.println("** Hi! **");
    }
    public void show() {
        System.out.println(" Good Evening ");
    }

    public static void main(String args[]){
        TestInterface obj = new TestInterface();
        obj.print();
        obj.show();
  }
}
