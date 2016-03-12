/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {1, 3, 4, 8, 7, 9}, sum = 0,average, i;
        for (i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        average = sum / a.length;

        System.out.println("Sum = " + sum + " Average = " + average);
    }

}
