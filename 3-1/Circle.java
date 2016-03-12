/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ming
 */
public class Circle {

    double r;
    int n;

    double Arc(double a) {
        double j = 0;
        j = a * 3.14 * r / 180;
        return j;
    }

    double Pie(double a) {
        double s = 0;
        s = r * r * 3.14 * a / 360;
        return s;
    }
}
