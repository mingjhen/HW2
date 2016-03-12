/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Ming
 */
public class W2_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Circle[] c = new Circle[50];
        double x, a, p;
        int t = 0, opt, i, c1, c2, b, op = 0, searn;
        for (i = 0; i < 50; i++) {
            c[i] = new Circle();
        }

        while (true) {
            System.out.print("(1)產生圓 (2)查詢圓的弧長與面積 (3)印全部 (-1)跳出 :");
            opt = scanner.nextInt();

            while (opt == 1 || op == 1) {
                if (t >= 50) {
                    System.out.println("資料已經滿50筆!");
                    break;
                }
                b = 0;
                System.out.print("編碼:");
                c[t].n = scanner.nextInt();
                if (c[t].n == -1) {
                    break;
                }
                for (i = 0; i < t; i++) {
                    c1 = c[t].n;
                    c2 = c[i].n;
                    if (c1 == c2) {
                        b = 1;
                        System.out.println("編碼重複，請重新輸入!");
                    }
                }
                if (b == 1) {
                    continue;
                }
                System.out.print("半徑: ");
                c[t].r = scanner.nextDouble();

                if (c[t].r == -1) {
                    break;
                }
                t++;
            }
            if (opt == 2) {
                b = 0;
                System.out.print("要查尋圓的編碼:");
                searn = scanner.nextInt();
                for (i = 0; i < t; i++) {
                    if (searn == c[i].n) {
                        System.out.println("角度: ");
                        x = scanner.nextDouble();
                        a = c[i].Arc(x);
                        p = c[i].Pie(x);
                        System.out.println("弧長: " + a);
                        System.out.println("面積: " + p);
                        b = 1;
                    }
                }
                if (b == 0) {
                    System.out.println("沒有此編碼");
                }
            } else if (opt == 3) {
                for (i = 0; i < t; i++) {
                    System.out.println("編碼 : " + c[i].n + "\t半徑 : " + c[i].r);
                    System.out.println();
                }
            } else if (opt == -1) {
                break;
            }

        }

    }

}
