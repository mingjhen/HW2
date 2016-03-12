/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
 class Oval extends Shape{
    
    double l,s;
    public Oval(double l,double s) {
        double t;
        if(l<s)/*長短相反*/
        {
        t=l;
        l=s;
        s=t;
        }
        this.l = l;
        this.s = s;
    }

    public double area() {
        return 2 * 3.14 * s + 4 * (l - s);
    }
    void show(double a){
    System.out.println("橢圓形，面積 :"+a);
    }
}
