/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 * 2-2
 *
 * @author Ming
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int Y, M, D, y;
        System.out.print("姓名: ");
        name = scanner.nextLine();
        System.out.print("西元年: ");
        Y = scanner.nextInt();
        System.out.print("月: ");
        M = scanner.nextInt();
        System.out.print("日: ");
        D = scanner.nextInt();
         System.out.println("姓名:" + name+ "\n生日:\n民國 " + (Y - 1911) + "年" + M + "月" + D + "日");
    }
}
