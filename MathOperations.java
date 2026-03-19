import java.util.*;
public class MathOperations{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a");
        a= sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        String op = sc.next();
        switch(op){
            case "+":
               System.out.println("sum of a+b "+(a+b));
               break;
            case "-":
                 System.out.println("sub of a-b "+(a-b));
                 break;
            case "*":
                 System.out.println("mul of a*b "+(a*b));
                 break;
            case "/":
                 System.out.println("div of a/b "+(a/b));
                 break;
            case "%":
                 System.out.println("mod of a%b "+(a%b));
                 break;
            default :
             System.out.println("invalid operator");
        }
       
        // using switch implement the calculator program accept char as string .
        // area of rectangle
        // perimeter of rectangle 
        // grading system 
        // max of 3 numbers
    }  

}