import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sexy = new Scanner(System.in);
        System.out.println("Enter the desierd number=");
        int num = sexy.nextInt();

        if(num%2==0)
        {
            System.out.println("This number is even");

        }
        else {
            System.out.println("This number is odd");
        }




    }
}
