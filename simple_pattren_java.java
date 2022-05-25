import java.util.*;
public class simple_pattren_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number=");
        int i, j, k;
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (k = n; k >= i; k--)
                System.out.print(" ");
            for (j = 1; j <= m; j++)
                if(i==1||j==1||i==n||j==m)
                System.out.print("*");
               else{
                    System.out.print(" ");}
                    System.out.println("");



        }

    }
}