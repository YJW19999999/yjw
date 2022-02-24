/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author yjw
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,sum=0;
       Scanner input=new Scanner(System.in);
       for(int i=1;i<=8;i++)
               {a=input.nextInt();
               sum+=a;
               }
       System.out.println("sum="+sum);
    }
    
    
}
