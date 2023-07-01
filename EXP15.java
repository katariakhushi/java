class MethodOverload {
  void area(float x){
    System.out.println("The area of the square is " + Math.pow(x,2) + " sq units");
  }
  void area(float x, float y){
    System.out.println("The area of rectangle is " + x*y + " sq units");
  }
  void area(double x){
    double z =3.14*x*x;
    System.out.println("The area of circle is " + z + " sq units");
  }
}
public class EXP15{
   public static void main(String args[]){
      MethodOverload ob = new MethodOverload();
      ob.area(8);
      ob.area(4,8);
      ob.area(3.8);
  }

}
   

   
