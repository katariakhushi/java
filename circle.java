public class circle {
    double x,y,radius;
    circle(){
        x=5;y=5;radius=1;
    }
    circle(double r){
        x=4;y=4;radius=r;
    }
    public static void main(String args[]){
        circle c1 =new circle();
        System.out.println("Centre is at " + c1.x + "x and " + c1.y + "y");
        System.out.println("Radius of circle 1 is " + c1.radius);
        circle c2 =new circle(2.5);
        System.out.println("Centre is at " + c2.x + "x and " + c2.y + "y");
        System.out.println("Radius of circle 2 is " + c2.radius);
  }
}
