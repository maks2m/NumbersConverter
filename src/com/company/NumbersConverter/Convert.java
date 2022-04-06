package com.company.NumbersConverter;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Convert {
    private final Scanner input = new Scanner(System.in);

    private final Pattern patternBin = Pattern.compile("[01]*");
    private final Pattern patternHex = Pattern.compile("[a-fA-F0-9]*");

    private int getInt(){
        int num = input.nextInt();
        if (num>0 && num<=10000) {
            return num;
        } else {
            System.out.println("Введенное значение не из диапазона 1 - 10000");
            System.exit(0);
            return 0;
        }
    }

    private int getBin() {
        int num = Integer.parseInt(input.next(patternBin), 2);
        if (num>0 && num<=10000) {
            return num;
        } else {
            System.out.println("Введенное значение не из диапазона 1 - 10011100010000");
            System.exit(0);
            return 0;
        }
    }

    private int getHex(){
        int num = Integer.parseInt(input.next(patternHex), 16);
        if (num>0 && num<=10000) {
            return num;
        } else {
            System.out.println("Введенное значение не из диапазона 1 - 2710");
            System.exit(0);
            return 0;
        }
    }

    public void printDexToBin(){
        System.out.println("Введите число в десятичном формате в диапазоне 1 - 10000");
        System.out.println(Integer.toBinaryString(getInt()));
    }
    public void printDexToHex(){
        System.out.println("Введите число в десятичном формате в диапазоне 1 - 10000");
        System.out.println(Integer.toHexString(getInt()));
    }
    public void printBinToDex(){
        System.out.println("Введите число в двоичном формате в диапазоне 1 - 10011100010000");
        System.out.println(getBin());
    }
    public void printBinToHex(){
        System.out.println("Введите число в двоичном формате в диапазоне 1 - 10011100010000");
        System.out.println(Integer.toHexString(getBin()));
    }
    public void printHexToBin(){
        System.out.println("Введите число в шестнадцатиричном формате в диапазоне 1 - 2710");
        System.out.println(Integer.toBinaryString(getHex()));
    }
    public void printHexToDex(){
        System.out.println("Введите число в шестнадцатиричном формате в диапазоне 1 - 2710");
        System.out.println(getHex());
    }

}
