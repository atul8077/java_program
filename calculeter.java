import java.util.*;
public class calculeter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number a : ");
        int a=sc.nextInt();
        System.out.println("enter number b : ");
        int b=sc.nextInt();
        System.out.println("enter the operater : ");
        char op=sc.next().charAt(0);
        switch(op){
        case '+' : System.out.println(a+b);
                  break;
        case '-' : System.out.println(a-b);
                    break;  
        case '*' : System.out.println(a*b);
                    break;                 
        case '/' : System.out.println(a/b);
                    break;   
        default : System.out.println("wrong input");              
        }
    }
    
}
