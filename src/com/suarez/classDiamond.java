package com.suarez;
/*
Class Diamond will print a diamond and a X
Maria I Suarez
12/2/2019
Ver 1
 */
public class classDiamond {
    public static void main(String[] args) {
 //   Diamond();
  //  X();
    star(6,10);
    }
    public static void star(int line, int star )
    {
        for(int i=1; i<=line; i++)
        {
            for (int j=1; j<= star; j++)
            {
                System.out.print("*");
            }
            System.out.println();


        }
    }






















    public static void Diamond()
    {
        top();
        bot();
    }
    public static void X(){
        bot();
        top();
    }
    public static void top(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void bot(){
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
}
