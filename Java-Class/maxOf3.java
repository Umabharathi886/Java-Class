import java.util.*;
public class maxOf3{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c= sc.nextInt();
     // using if else if else
    if(a>b && a> c){
        System.out.print(" max is a");
     }
     else if(b> a && b> c){
        System.out.print("max is b");
     }
     else  {
        System.out.print("max is c");
     }
     
    //if else ladder
     if(a>b){
        if(a>c){
            System.out.print("max is a");
        }
        else{
            System.out.print("max is c");
        }
     }
       else{ 
        if(b>c){
            System.out.print("max is b");
        }
        else{
            System.out.print("max is c");
        }
       }
     
    }
}