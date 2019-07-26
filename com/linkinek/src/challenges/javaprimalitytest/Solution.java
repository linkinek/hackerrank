package challenges.javaprimalitytest;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        scanner.close();

        boolean probablePrime = new BigInteger(n).isProbablePrime(100);

        if (probablePrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
