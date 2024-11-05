import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter a number");
            num = scan.nextInt();
            if ( num >= 0) {
                sum += num;
            }   
        } while ( num >= 0);

        System.out.println("The sum is " +sum);
        scan.close();

    }
}
