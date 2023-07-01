public class EXP29{
    public static void main(String args[]){
        Fruits fruits = new Mango();
        fruits.color();
  }
}
class Fruits{
    void color() {
        System.out.println("Parent class is invoked");
    }
}
class Mango extends Fruits {
    @Override
    void color() {
        System.out.println("Child class is invoked");
    }
}
