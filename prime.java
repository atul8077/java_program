import java.util.*;
public class prime {
    public static String prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return("not prime");
            }
        }
        return("prime");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int a=sc.nextInt();
        System.out.println(prime(a));

    }
    
}
