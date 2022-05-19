import java.util.Scanner;
public class Conditional_3 {
    public static void main(String[] args) {
        Scanner sam = new Scanner(System.in);
        System.out.println("Enter the  number=");
        int num1 = sam.nextInt();
        int num2 = sam.nextInt();
        if(num1==num2)
        {
            System.out.println("Both are equal");

        }
        else if (num1>num2){
            System.out.println("num1 is greater"+num1);

        }
        else {
                System.out.println("num2 number is greater="+num2);
        }



    }
}
