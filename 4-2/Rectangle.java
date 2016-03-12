/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
class Rectangle extends Shape {

    double l, s;

    public Rectangle(double l, double s) {
        this.l = l;
        this.s = s;
    }

    public double area() {
        return l*s;
    }
    void show(double a){
    System.out.println("矩形，面積 :"+a);
    }
}
