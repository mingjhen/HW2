
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ming
 */
public class W2_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 Scanner scanner=new Scanner(System.in);
		double num1,num2;
		int opt;
		System.out.print("number1:");
		num1=scanner.nextDouble();
		System.out.print("number2:");
		num2=scanner.nextDouble();
                System.out.print("(1)+ (2)- (3)x (4)/ :");
		opt=scanner.nextInt();
		if(opt==4&&num2==0)
			System.out.println("Error!分母不可為零");
		else{
			switch(opt){
				case 1:
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
				case 2:
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
				case 3:
				System.out.println(num1+"x"+num2+"="+(num1*num2));
				break;
				case 4:
				System.out.println(num1+"/"+num2+"="+(num1/num2));
				break;
				default:
				System.out.println("運算子選項只能輸入1~4:");
				break;
			}
			
		}
    }
    
}
