public class countObj {
    static int count = 0;
    countObj(){
        count++;
    }
    public static void main(String args[]){
        countObj object1 = new countObj();
        countObj object2 = new countObj();
        countObj object3 = new countObj();
        countObj object4 = new countObj();
System.out.println("Number of object created is "+count);
  }
}
