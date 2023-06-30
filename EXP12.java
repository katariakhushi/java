
public class EXP12
{
    public static void main(String[] args) {
        int a[] = {10,20,50,60};
        int avg=0,sum=0;
        for(int i=0;i<a.length;i++)
        sum = sum+a[i];
        avg = sum/(a.length);
        System.out.println("Sum = " + sum + " and Average = " +avg);
    }
}
