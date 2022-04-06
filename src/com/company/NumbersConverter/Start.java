package com.company.NumbersConverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        System.out.println("Вас привествует приложение для конвертации чисел");
        System.out.println("выберите направление для конвертации:");
        System.out.println("1 - из 10-ой в 2-ую");
        System.out.println("2 - из 10-ой в 16-ую");
        System.out.println("3 - из 2-ой в 10-ую");
        System.out.println("4 - из 2-ой в 16-ую");
        System.out.println("5 - из 16-ой в 2-ую");
        System.out.println("6 - из 16-ой в 10-ую");
        System.out.println("0 - выход из приложения");
        Scanner input = new Scanner(System.in);
        Convert convert = new Convert();
        try {
            int inputInt = input.nextInt();
            switch (inputInt){
                case 1:
                    convert.printDexToBin();
                    break;
                case 2:
                    convert.printDexToHex();
                    break;
                case 3:
                    convert.printBinToDex();
                    break;
                case 4:
                    convert.printBinToHex();
                    break;
                case 5:
                    convert.printHexToBin();
                    break;
                case 6:
                    convert.printHexToDex();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Введено НЕВЕРНОЕ знаечние!");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Введено НЕВЕРНОЕ знаечние!");
        }
    }
}
