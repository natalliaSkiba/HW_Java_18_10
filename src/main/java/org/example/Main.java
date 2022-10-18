package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите isWeekend (true/false");
        Scanner scanner = new Scanner(System.in);
        boolean isWeekend = scanner.nextBoolean();
        System.out.println("Введите isRain (true/false");
         Scanner scanner1 = new Scanner(System.in);
         boolean isRain = scanner1.nextBoolean();

         if (isWeekend==true && isRain==false) {
             boolean canWalk = true;
             System.out.println("canWalk= " + canWalk);
         }
         else {
             boolean canWalk = false;
             System.out.println("canWalk= " + canWalk);
         }

    }
}