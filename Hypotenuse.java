import java.util.*;
public class Hypotenuse{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double j = sc.nextDouble();
        double c = Math.sqrt(Math.pow(i,2) + Math.pow(j,2));
        System.out.println(String.format("%.2f", c));
        
        
    }
}