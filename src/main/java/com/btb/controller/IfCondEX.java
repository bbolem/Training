package com.btb.controller;
public class IfCondEX {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if(i % 2 == 0) {
            System.out.println("It's an even number.");
            if (i > 100){
                System.out.println("It's > 100.");
            }
        }
        else {
            System.out.println("It's an odd number.");
        }
    }
}
