import java.util.*;
public class MultiplyFunction{
    public static int multiplyNumber(int a , int b ){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int result=multiplyNumber(a, b);
        System.out.println("multiplication is: "+ result);

    }
}
