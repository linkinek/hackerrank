package challenges.javabiginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.next();
        String second = scanner.next();

        BigInteger oneInteger = new BigInteger(one);
        BigInteger secondInteger = new BigInteger(second);

        System.out.println(oneInteger.add(secondInteger));
        System.out.println(oneInteger.multiply(secondInteger));
    }
}


