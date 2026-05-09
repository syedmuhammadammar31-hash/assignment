import java.util.Scanner;

public class BinaryConverterB {

    // function to convert to binary and store in array
    public static int[] toBinaryArray(int num) {
        // handle 0 case
        if (num == 0) {
            return new int[] { 0 };
        }

        // count the bits we need
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 2;
        }

        // make array to store bits
        int bits[] = new int[count];

        // fill array with remainders
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            bits[i] = temp % 2; // store remainder
            temp = temp / 2;
        }

        return bits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // convert to array
        int result[] = toBinaryArray(num);

        // print array contents
        System.out.print("Array: ");
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j]);
        }
        System.out.println();

        sc.close();
    }
}