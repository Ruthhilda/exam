/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author mukis
 */
public class arraysExample {
    public static void main(String[]args){
        String[]names={"Ali","Noel","Alex","Ruth","Peruth"};
        System.out.println("oop is tought by"+names[3]);
        
        int years[]={2,3,4,5,6,7,8,9,10};
        System.out.println("BIT AND BCS are courses for"+years[2]+"years");
        
        /*
        String[]names={"Ali","Noel","Alex","Ruth","Peruth"};
        System.out.println("oop is tought by"+names[3]);
        
        int years[]={2,3,4,5,6,7,8,9,10};
        System.out.println("BIT AND BCS are courses for"+years[2]+"years");
        
        
        */
        // single dimensional arrays
        int no[]=new int[7];//int[]no=new int[specifies the array length]
        no[0]=90;
        no[1]=80;
        no[2]=70;
        no[3]=60;
        no[4]=50;
        no[5]=50;
        no[6]=40;
        
        System.out.println(no[5]);
        
        
        // multi-dimensional arrays
        int x[][]=new int[2][2];
        x[0][0]=4;
        x[1][1]=2;
        x[1][0]=6;
        x[0][1]=8;
        System.out.println(x[1][0]);
        
        
    }
    
}
