package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(number(26, 11));
        System.out.println(number(45, 23));
        System.out.println(number(27, 13));
        System.out.println(number(34, -10));
        System.out.println(number(89, 4));
        System.out.println(number(generateRandomAge(), generateRandomTemp()));
    }


    public static String number(int agePerson, int temperature) {
        if (agePerson >= 20 && agePerson <= 45 && temperature >= -20 && temperature <= 30) {
            return "можно идти гулять";
        } else if (agePerson < 20 && temperature >= 0 && temperature <= 28) {
            return "можно идти гулять";
        } else if (agePerson >= 45 && temperature <= -10 && temperature <= 25) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int agePerson = random.nextInt(45);
        return agePerson;
    }
    public static int generateRandomTemp(){
        Random random = new Random();
        int temperature = random.nextInt(27);
        return temperature;
    }
}
