package org.casa.br.EAD;

import java.util.ArrayList;

public class Exercise25 {
        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            names.add("David");
            names.add("Eve");

            for (String name : names) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
