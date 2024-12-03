import java.util.Scanner;


public class Demo {
    public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       int n=scan.nextInt();
       int[]ar=new int[n];
       for(int i=0;i<n;i++){
        ar[i]=scan.nextInt();
       }
       int k=scan.nextInt();
       findIndex(ar,k);
    }
    static void findIndex(int[]ar,int k){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==k){
                System.out.print(i);
                break;
            }
        }
    }
}
