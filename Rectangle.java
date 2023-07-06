class Rectangle{
    int l,b,a;
    Rectangle()
    {
        l=134;
        b=13;
    }
    void GetData()
    {
        a = l*b;
        System.out.println("Area of rectangle is: " + a);
    }
}
class EXP23{
    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        rect.GetData();
  }
}
