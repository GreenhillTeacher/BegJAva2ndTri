package com.suarez;
/*
Changing the size of a figure will print a diamond and a X
Maria I Suarez
12/6/2019
Ver 1
 */
public class PrintNumber {
    public static void main(String[] args) {
        printNum(15);
        printNum(20);
        printNum(50);
    }


    public static void printNum(int num){
        for (int count = 1; count <= num; count++) {
            System.out.print("[" + count + "]");

            }
            System.out.println();
        }
    }