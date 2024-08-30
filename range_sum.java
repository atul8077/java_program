import java.util.*;
public class range_sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range :");
        int r=sc.nextInt();
        int sum=0;
        for(int i=1;i<=r;i++){
            sum=sum+i;
        }
        System.out.println(sum);
   }
    
}
