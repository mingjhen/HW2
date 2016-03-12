
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class W2_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Circle[] c = new Circle[50];
        Oval[] o = new Oval[50];
        double x, a, p,tl;
        int t = 0, t1 = 0, opt, i, c1, c2, b, op = 0, searn;
        for (i = 0; i < 50; i++) {
            c[i] = new Circle();
            o[i] = new Oval();
        }

        while (true) {
            System.out.print("(1)產生圓 (2)產生橢圓 (3)印面積跟長 (-1)跳出 :");
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
                    if (c[t].n == c[i].n) {
                        b = 1;
                        System.out.println("編碼重複，請重新輸入!");
                    }
                }
                for (i = 0; i < t1; i++) {
                    if (o[t1].n == o[i].n) {
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
            while (opt == 2) {
                b = 0;
                if (t1 >= 50) {
                    System.out.println("資料已經滿50筆!");
                    break;
                }
                b = 0;
                System.out.print("編碼:");
                o[t1].n = scanner.nextInt();
                if (o[t1].n == -1) {
                    break;
                }
                for (i = 0; i < t; i++) {
                    if (c[i].n == o[t1].n) {
                        b = 1;
                        System.out.println("編碼重複，請重新輸入!");
                    }
                }
                for (i = 0; i < t1; i++) {
                    if (o[t1].n == o[i].n) {
                        b = 1;
                        System.out.println("編碼重複，請重新輸入!");
                    }
                }
                if (b == 1) {
                    continue;
                }
                System.out.print("短邊: ");
                o[t1].r = scanner.nextDouble();
                System.out.print("長邊: ");
                o[t1].l = scanner.nextDouble();
                if(o[t1].r>o[t1].l){
                tl=o[t1].r;
                o[t1].r=o[t1].l;
                o[t1].l=tl;
                }
                if (o[t1].r <=0||o[t1].l<=0) {
                    break;
                }
                t1++;
            }
           if (opt == 3) {
                 b = 0;
                System.out.print("要查尋的編碼:");
                searn = scanner.nextInt();
                for (i = 0; i < t; i++) {
                    if (searn == c[i].n) {
                        System.out.println("圓，角度: ");
                        x = scanner.nextDouble();
                        a = c[i].Arc(x);
                        p = c[i].Pie(x);
                        System.out.println("弧長: " + a);
                        System.out.println("面積: " + p);
                        b = 1;
                    }
                }
                for (i = 0; i < t1; i++){
                 if (searn == o[i].n){
                     System.out.println("橢圓: ");
                        a = o[i].Arc();
                        p = o[i].Pie();
                        System.out.println("周長: " + a);
                        System.out.println("面積: " + p);
                        b = 1;
                 }
                }
                if (b == 0) {
                    System.out.println("沒有此編碼");
                }
            } else if (opt == -1) {
                break;
            }

        }
    }
}
