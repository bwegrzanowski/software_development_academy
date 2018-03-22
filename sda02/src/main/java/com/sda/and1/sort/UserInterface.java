package com.sda.and1.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        boolean exit = false;
        List<Integer> arrayList = new ArrayList<>();
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            String inputStrem = scanner.nextLine();
            String[] split = inputStrem.split(" ");
            String comend = split[0];
            int value = 0;
            if (split.length > 1) {
                value = Integer.parseInt(split[1]);
            }
            switch (comend) {
                case "add":
                    System.out.println(comend);
                    add(arrayList, value);
                    break;
                case "show":
                    System.out.println(arrayList);
                    break;
            }

        }
    }

    private static void add(List list, Integer elementToAdd) {
        list.add(elementToAdd);

    }

}