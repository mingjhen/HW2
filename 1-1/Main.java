
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ming
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int h=0, h1, h2, m=0, m1, m2, s1, s2, s=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("start :\n h:");
        h1 = scanner.nextInt();
        System.out.print("m:");
        m1 = scanner.nextInt();
        System.out.print("s:");
        s1 = scanner.nextInt();

        System.out.print("End : \nh:");
        h2 = scanner.nextInt();
        System.out.print("m:");
        m2 = scanner.nextInt();
        System.out.print("s:");
        s2 = scanner.nextInt();
        if(h2 - h1<0) {
            h = h1;
            h1 = h2;
            h2 = h;
        }
        if (h2 - h1 >= 0) {
            h = h2 - h1;
            if (m2 - m1 >= 0) {
                m = m2 - m1;
                if (s2 - s1 >= 0) {
                    s = s2 - s1;
                } else {
                    m = m - 1;
                    if (m < 0) {
                        h = h - 1;
                        m = m + 60;
                    }
                    s = s2 - s1 + 60;
                }
            } else {
                h = h - 1;
                m = m2 - m1 + 60;
                if (s2 - s1 >= 0) {
                    s = s2 - s1;
                } else {
                    m = m - 1;
                    s = s2 - s1 + 60;
                }
            }
        }
        s=s+60*m+60*60*h;
        System.out.println("s="+s);
    }

}
