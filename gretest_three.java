import java.util.*;
public class gretest_three {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is grater");
            }
        }else{
            if(b>c){
                System.out.println("b is greter");
            }else{
                System.out.println("c is grater");
            }
        }
    }
    
}
