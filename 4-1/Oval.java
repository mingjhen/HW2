/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Oval extends Circle {

    double l;

    Oval() {
        super();
        this.l = 0;
    }

    double Arc() {
        double j = 0;
        j = 2 * 3.14 * r + 4 * (l - r);
        return j;
    }

    double Pie() {
        double s = 0;
        s = r * l * 3.14;
        return s;
    }
}
