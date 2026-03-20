import java.util.*;
public class subway{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in) ;
     System.out.println("1 for jump");
     System.out.println("2 for roll");
     System.out.println("3 for moving left");
     System.out.println("4 for moving right");
     int n = sc.nextInt();
     switch(n){
        case 1:
            System.out.print("player jumps over obstalce");
            break;
        case 2:
            System.out.print("player rolls under the obstacle");
            break;
        case 3:
            System.out.print("player moves right direction");
            break;
        case 4:
            System.out.print("player move in left direction");
            break;
        default:
            System.out.print("invalid move");
     }
    }
}