import java.util.*;
public class WaterTaps{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt(); 
        int b =sc.nextInt();
        double c=1.0/a+1.0/b;
        double res = 1.0/c;
        System.out.println((int)Math.round (res));
    }
}