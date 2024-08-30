public class reversh {
    public static void main(String args[]){
        int n=654;
        int r=0;
        while(n!=0){
            int rd=n%10;
        
            r=r*10+rd;
            n=n/10;
        }
        System.out.println(r);

    }
    
}
