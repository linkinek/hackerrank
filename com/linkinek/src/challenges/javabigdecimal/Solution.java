package challenges.javabigdecimal;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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

        List<Map.Entry<String, Double>> map = new ArrayList<>();
        Arrays.stream(s)
                .filter(Objects::nonNull)
                .forEach(text -> map.add(new AbstractMap.SimpleEntry<>(text, new Double(text))));

        map.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int index = 0;
        String[] newArray = new String[map.size()];
        for (Map.Entry<String, Double> entry : map) {
            newArray[index] = entry.getKey();
            index++;
        }

        s = newArray;

        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
