package ru.isbo1016.chumakov.tipis3;
import java.util.Scanner;
import java.lang.Math;

public class a1 {
    public static void main(String args[]) {
        System.out.print("Введите m: ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        System.out.println ("Вы ввели число " + m);
        System.out.println ("Энтропия указанного источника сообщений " + Math.log(m)/Math.log(2));
    }
}
