package challenges.sorting;

import java.util.Scanner;

import static java.lang.String.format;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        boolean flag = true;
        int swaps = 0;

        while (flag) {
            flag = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    flag = true;
                    swaps = swaps + 1;
                    int prev = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = prev;
                }
            }
        }

        System.out.println(format("Array is sorted in %s swaps.", swaps));
        System.out.println(format("First Element: %s", a[0]));
        System.out.println(format("Last Element: %s", a[n - 1]));
    }
}