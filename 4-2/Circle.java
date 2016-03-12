/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
class Circle extends Shape {

    double r;
    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }
    void show(double a){
    System.out.println("圓形，面積 :"+a);
    }

}
