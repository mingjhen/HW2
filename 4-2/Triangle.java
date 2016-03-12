/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
 class Triangle extends Shape{
    
    double h,w;
    public Triangle(double w,double h) {
        this.w = w;
        this.h = h;
    }

    public double area() {
        return (w*h)/2;
    }
    void show(double a){
    System.out.println("三角形，面積 :"+a);
    }
}
