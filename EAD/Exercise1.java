package org.casa.br.EAD;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }
        System.out.println("Numbers entered: " + numbers);
        sc.close();
    }
}
