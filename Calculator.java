import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("***CALCULATOR***");
        int i=1;
        while(i==1){
            System.out.println("Enter:-\n 1 for ADDITION. \n 2 for SUBTRACTION. \n 3 for MULTIPLICATION. \n 4 for DIVISION. \n 5 for EXIT.");
            System.out.println("Enter first number:");
            float a= sc.nextFloat();
            System.out.println("Enter second number:");
            float b= sc.nextFloat();
            System.out.println("Enter your choice: ");
            int input=sc.nextInt();
            switch(input){
            case 1: float sum = a+b;
            System.out.print("SUM= "+ sum);
            break;
            case 2: float difference = a-b;
            System.out.println("DIFFERENCE: "+difference);
            break;
            case 3: float product = a*b;
            System.out.println("PRODUCT: "+ product);
            break;
            case 4: if(a==0){
                System.out.println("ZERO devided by any number is "+0);
            }else if(b==0){
                System.out.println("Dividing a number by zero is UNDEFINED.");
            }else{
                float result =a/b;
                System.out.println("RESULT: "+ result);}
            break;
            case 5:System.out.println("---Thank You.---");
            break;
            default: System.out.println("INVALID OPERATION CHOICE.");
            
        }
            System.out.println("\n*Press 1 to continue.*");
            i=sc.nextInt();
        }

    }
}
