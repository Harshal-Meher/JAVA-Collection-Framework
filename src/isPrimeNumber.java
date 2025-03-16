import java.util.Scanner;

public class isPrimeNumber {
    public static boolean isPrime(int val) {

        if (val < 2) {
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(val) ; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        while (true) {
            System.out.print("Enter the Value : ");
            int val = sc.nextInt();
            System.out.println("Is Prime Number : "+isPrime(val));
            System.out.println("----------------------------------");
        }
    }
}
