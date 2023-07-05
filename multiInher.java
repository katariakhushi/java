class Animal {
    void eat(){
        System.out.println("Eating!");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Barking!");
    }
}
class child extends Dog {
    void shout(){
        System.out.println("Shouting!");
    }
}
public class multiInher {
    public static void main(String args[]){
        child c = new child();
        c.shout();
        c.bark();
        c.eat();
  }
}
