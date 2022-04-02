package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(12, 9, 1, 10, 3, 4, 4, 5, 5, 6, 7));
        // Задание 1
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num.toString());
            }
        }
        System.out.println();
        // Задание 2
        List<Integer> numsCopy = new ArrayList<>();
        int b = 0;
        for (int l = 0; l < nums.size(); l++) {
            numsCopy.add(nums.get(l));
            b = b + nums.get(l);
        }
        int c = numsCopy.size();
        Integer integer = numsCopy.get(0);
        for (int i = 0; i < c; i++) {
            int a = integer;
            for (int j = 1; j < numsCopy.size(); j++) {
                if (numsCopy.get(j) < a) {
                    a = numsCopy.get(j);
                }
            }
            if (a % 2 == 0 && b != a) {
                System.out.print(a + " ");
            }
            b = a;
            numsCopy.remove((Integer) a);
        }
        System.out.println();
        // Задание 2 (второй способ)
        List<Integer> numsCopy2 = new ArrayList<>();
        int k = 0;
        for (int l = 0; l < nums.size(); l++) {
            numsCopy2.add(nums.get(l));
            k = k + nums.get(l);
        }
        Collections.sort(numsCopy2);
        for (Integer num : numsCopy2) {
            if (num % 2 == 0 && num != k) {
                System.out.print(num + " ");
                k = num;
            }
        }
        System.out.println();
        // Задание 3
        List<String> wordsList = new ArrayList<>(List.of("один", "один", "два", "три", "один", "два", "три"));
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < wordsList.size(); i++) {
            wordSet.add(wordsList.get(i));
        }
        System.out.println(wordSet);

        // Задание 4
        System.out.println();
        List<String> words = new ArrayList<>(List.of("один", "один", "два", "три", "один", "два", "три"));
        int d = words.size();
        int count = 0;
        for (int i = 0; i < d; i++) {
            String a = words.get(0);
            for (int j = 1; j < words.size(); j++) {
                if (words.get(j) == a) {
                    count = count + 1;
                    words.remove(words.get(j));
                }
            }
        }
        System.out.println(count);
    }
}

