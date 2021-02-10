package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String top = "машина едет в горы";
        String world = "человек идет ";
        final int NUM = 12;

        System.out.println(world+NUM);



        if (NUM<0){
            System.out.println("вы сохронили отрицатильное число");
        }else if (NUM>0){
            System.out.println("вы сохранили положительное число");
        }else {
            System.out.println("вы сохранили 0");
        }

        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Здравствуйте " + name);

    }
}
