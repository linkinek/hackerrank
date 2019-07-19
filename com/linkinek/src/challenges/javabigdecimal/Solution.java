package challenges.javabigdecimal;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        s = Arrays.stream(s)
                .filter(Objects::nonNull)
                .map(text -> new AbstractMap.SimpleEntry<>(text, new Double(text)))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(AbstractMap.SimpleEntry::getKey)
                .toArray(String[]::new);

        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
