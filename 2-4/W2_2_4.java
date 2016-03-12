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
public class W2_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[50];
        String[] score = new String[50];
        String[] num = new String[50];
        String n;
        int c = 0, opt, i,t=0;
        while (true) {
            System.out.print("(1)Input (2)Search (3)Display (-1)Out:");
            opt = scanner.nextInt();
            t=0;
            if (opt == 1) {
                if (c >= 50) {
                    System.out.println("Datas don't more than 50!");
                    continue;
                }
                System.out.println("Name");
                name[c] = scanner.next();
                System.out.println("Number");
                num[c] = scanner.next();
                for(i=0;i<c;i++){
                if(num[c].equals(num[i])){
                System.out.println("Duplication of number");
                t=1;
                }
                }if(t==1)
                    continue;
                c++;
                try {
                    System.out.println("Score");
                    score[c-1] = scanner.next();
                    Integer.parseInt(score[c-1]);
                } catch (NumberFormatException e) {
                    c--;
                    System.out.println("Error:" + e);
                }
            } else if (opt == 2) {
                System.out.print("Search number :");
                n = scanner.next();
                for (i = 0; i < c; i++) {
                    if (n.equals(num[i])) {
                        System.out.println("Name : " + name[i] + "\tNumber : " + num[i] + "\tScore : " + score[i]);
                        t=1;
                    }
                }
                if(t==0){
                System.out.println("Number : "+n+"\thas no data!");
                }
            } else if (opt == 3) {
                for (i = 0; i < c; i++) {
                    System.out.println("Name : " + name[i] + "\tNumber : " + num[i] + "\tScore : " + score[i]);
                }
            } else if (opt == -1) {
                break;
            } else {
                System.out.println("Option reset!");
            }
        }
    }

}
