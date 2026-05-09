import java.util.Scanner;

public class BinaryConverterC {

    // convert to binary and return as string
    public static String toBinaryString(int num) {
        if (num == 0) {
            return "0";
        }

        String result = "";
        int temp = num;

        // divide by 2 and build string
        while (temp > 0) {
            int rem = temp % 2; // get remainder
            result = rem + result; // add to front
            temp = temp / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // convert and print
        String binary = toBinaryString(num);

        System.out.println("Binary: " + binary);

        sc.close();
    }
}