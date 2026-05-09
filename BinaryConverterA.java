import java.util.Scanner;

public class BinaryConverterA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // convert using divide by 2 method
        int rem;
        String binary = "";

        // keep dividing by 2 and get remainders
        while (num > 0) {
            rem = num % 2; // get the last bit
            binary = rem + binary; // add to front
            num = num / 2;
        }

        System.out.println("Binary: " + binary);

        sc.close();
    }
}