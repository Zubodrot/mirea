package ru.isbo1016.chumakov.tipis3;

import java.util.Scanner;
import java.lang.Math;

public class a3 {
    public static void main(String args[]) {
        double[][] r = new double[100][100];
        double[] w = new double[100];
        double[] u = new double[100];
        double[][] s = new double[100][100];
        double[][] p = new double[100][100];
        double l=0;
        double h2=0;
        double summp=0;
        System.out.print("Введите m: ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        System.out.println("Вы ввели число " + m);
        for (int i=0; i<m;i++){
            for(int j=0; j<m;j++){
                r[i][j] = Math.round(Math.random());
                l=l+1;
            }
        }

        System.out.println();
        System.out.println("Матрица");
        System.out.println();

        for (int i=0; i<m;i++){
            for(int j=0; j<m;j++){
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }

        for (int i=0; i<m;i++){
            for(int j=0; j<m;j++){
                w[i]=w[i]+r[i][j];
            }
            System.out.println();
        }

        for (int i=0; i<m;i++){
            System.out.print(w[i]+" ");
        }

        System.out.println();

        for (int j=0; j<m;j++){
            for(int i=0; i<m;i++){
                u[j]=u[j]+r[i][j];

            }
            System.out.println();
        }

        for (int i=0; i<m;i++){
            System.out.print(u[i]+" ");
        }

        System.out.println();

        for (int i=0; i<m;i++){
            for(int j=0; j<m;j++){
               s[i][j]=s[i][j]+ (r[i][j]/w[i]);
            }
            System.out.println();
        }

        for (int i=0; i<m;i++){
            for(int j=0; j<m;j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }

        for (int i=0; i<m;i++){
            for(int j=0; j<m;j++){
                p[i][j]=p[i][j]+ (s[i][j]/u[j]);
            }
            System.out.println();
        }

        for (int i=0; i<m;i++){
            for(int j=0; j<m;j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }

/*
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
*/
    }
}
