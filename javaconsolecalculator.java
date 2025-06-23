import java.util.Scanner;
public class javaconsolecalculator{
    public static double addition(double a,double b){
        return a+b;
    }
    public static double subtraction(double a,double b){
        return a-b;
    }
    public static double product(double a,double b){
        return a*b;
    }
    public static double division(double a,double b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("enter first number:");
            double n1=sc.nextDouble();
            System.out.print("enter first number:");
            double n2=sc.nextDouble();
            System.out.print("choose one operator(+,-,*,/,):");
            char ch=sc.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("addition:" + addition(n1, n2));
                    break;
                case '-':
                    System.out.println("difference : "+ subtraction(n1,n2));
                    break;
                case '*':
                    System.out.println("product : "+ product(n1, n2));
                    break;
                case '/':
                    System.out.println("difference : "+ division(n1, n2));
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
            System.out.println("do you want to continue(y/n)?");
            char opt=sc.next().charAt(0);
            if(opt=='n') break;
        }
        sc.close();
    }
}