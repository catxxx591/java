import java.util.*;
 public class p2 {
    public static void main(String[] argv) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(int i=1;i<=a;i++){   

           for(int j=a-1;j>=i;j--){
           System.out.print(" ");
           }
           
           for(int k=1;k<=i;k++){
           System.out.print("*");                   
           }
         System.out.println();
        }
        

    }
}
