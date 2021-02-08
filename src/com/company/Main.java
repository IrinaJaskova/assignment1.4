package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter day number");
        int day = input.nextInt();

        if (day <= 0 || day > 365) {
            System.out.println("Enter correct day between 1 and 365 ");

        } else {
            if (day >= 1 && day <= 31) {
                System.out.println("It is January");
            }
            if (day >= 32 && day <= 59) {
                System.out.println("It is February");
            }
            if (day >= 33 && day <= 90) {
                System.out.println("It is March");
            }
            if (day >= 91 && day <= 120) {
                System.out.println("It is April");
            }
            if (day >= 121 && day <= 151) {
                System.out.println("It is May");
            }
            if (day >= 152 && day <= 181) {
                System.out.println("It is June");
            }
            if (day >= 182 && day <= 212) {
                System.out.println("It is July");
            }
            if (day >= 213 && day <= 243) {
                System.out.println("It is August");
            }
            if (day >= 244 && day <= 273) {
                System.out.println("It is September");
            }
            if (day >= 274 && day <= 304) {
                System.out.println("It is October");
            }
            if (day >= 305 && day <= 334) {
                System.out.println("It is November");
            }
            if (day >= 335 && day <= 365) {
                System.out.println("It is December");
            }


        }
    }
}

