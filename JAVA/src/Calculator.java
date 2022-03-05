import java.util.Scanner;

public class Calculator {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello!");
        System.out.println("What do you want to do?");
        System.out.println("Press num1 for addition");
        System.out.println("Press num2 for subtraction");
        System.out.println("Press num3 for multiplication");
        System.out.println("Press num4 for divide");
        System.out.println("Press your option...");
        int n= input.nextInt();

        System.out.println("Enter number 1....");
        double n1=input.nextDouble();
        System.out.println("Enter number 2....");
        double n2=input.nextDouble();

        switch (n)
        {
            case 1:
                System.out.println("Your answer is "+ add(n1,n2));
                break;
            case 2:
                System.out.println("Your answer is "+ sub(n1,n2));
                break;
            case 3:
                System.out.println("Your answer is "+ multi(n1,n2));
                break;
            case 4:
                System.out.println("Your answer is "+ div(n1,n2));
                break;
            default:
                System.out.println("Your selected function is invalid");
                break;
        }
    }

    public static double add(double x,double y)
    {
        double a;
        a=x+y;
        return a;
    }
    public static double sub(double x,double y)
    {
        double a;
        a=x-y;
        return a;
    }
    public static double multi(double x,double y)
    {
        double a;
        a=x*y;
        return a;
    }
    public static double div(double x,double y)
    {
        double a;
        a=x/y;
        return a;
    }
}
