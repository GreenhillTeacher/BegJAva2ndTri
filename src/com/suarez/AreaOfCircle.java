package com.suarez;
/*
This program will calculate the area of a circle with specific radius
MAria I Suarez
122/4/2019
Ver1
 */
public class AreaOfCircle
{
    public static void main(String [] args){
        final double pi=3.14;
        double area;
        double radius= 4;
        area = radius * radius * pi;
        System.out.println("The area of a circle with radius "+ radius+" inches is "+ area+ "square inches");
    }
}
