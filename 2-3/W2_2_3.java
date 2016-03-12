/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author User
 */
public class W2_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        		Scanner scanner=new Scanner(System.in);
		int Y,i,c=0;
                System.out.print("西元年:");
		Y=scanner.nextInt();
		for(i=Y;i>0;i--){
			if(i%400==0||(i%4==0&&i%100!=0))
			{
				System.out.print(i+"\t");
				c++;
			}
			if(c==10){
                            c=0;
				System.out.println();
			}
				
		}
    }
    
}
