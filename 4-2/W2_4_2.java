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
public class W2_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double t1, t2, a;
        int opt;
        
        while (true) {
            System.out.print("算面積(1)圓形(2)橢圓形(3)矩形(4)三角形 (-1)break");
            opt = scanner.nextInt();
            if (opt == 1) {
                System.out.print("半徑:");
                t1 = scanner.nextDouble();
                Shape s = new Circle(t1);
                a = s.area();
                s.show(a);
            } else if (opt == 2) {
                System.out.print("長邊:");
                t1 = scanner.nextDouble();
                System.out.print("短邊:");
                t2 = scanner.nextDouble();
                 Shape s = new Oval(t1,t2);
                 a = s.area();
                s.show(a);
            } else if (opt == 3) {
                System.out.print("長:");
                t1 = scanner.nextDouble();
                System.out.print("寬:");
                t2 = scanner.nextDouble();
                 Shape s = new Rectangle(t1,t2);
                 a = s.area();
                s.show(a);
            } else if (opt == 4) {
                System.out.print("底:");
                t1 = scanner.nextDouble();
                System.out.print("高:");
                t2 = scanner.nextDouble();
                 Shape s = new Triangle(t1,t2);
                 a = s.area();
                s.show(a);
            } else if (opt == -1) {
                break;
            }

        }

    }

}
