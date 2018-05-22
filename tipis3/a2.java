package ru.isbo1016.chumakov.tipis3;
import java.util.Scanner;
import java.lang.Math;



public class a2 {


    public static void main(String args[]) {
        double[] r = new double[100];
        double[] p = new double[100];
        double l=0;
        double h2=0;
        double summp=0;
        System.out.print("Введите m: ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        System.out.println("Вы ввели число " + m);
        for (int i=0; i<m;i++){
            r[i]=Math.round(Math.random());
            System.out.print(r[i]+ "  ");
            l=l+r[i];
        }

        System.out.println();
        System.out.println("Сумма всех r(i)");
        System.out.println(l);
        System.out.println();

        for (int i=0; i<m;i++) {
            p[i]=r[i]/l;
            System.out.print(p[i]+ "  ");
            summp=summp+p[i];
        }

        System.out.println();
        System.out.println("Сумма всех p(i)");
        System.out.println(summp);
        System.out.println();

        for (int i=0; i<m;i++) {
            h2=h2+p[i]*(Math.log(m)/Math.log(2));
        }

        System.out.println();
        System.out.println("Энтропия смоделированного источника дискретных сообщений");
        System.out.println(h2);
        System.out.println();

    }
}
