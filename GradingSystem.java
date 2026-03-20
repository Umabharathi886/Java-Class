import java.util.*;
public class GradingSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        if(n> 8){
            System.out.print("Distinction");
        }
        else if(n>7 && n<8){
            System.out.print("first class");
        }
        else if(n<=7 && n> 6){
            System.out.print("second class");
        }
        else{
            System.out.print("not graduated");
        }
       
         }
}