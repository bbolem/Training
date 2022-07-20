package com.btb.controller;
public class SwitchEx {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);

        switch (i){
            case 0 :
                System.out.println("Zero"); break;
            case 1 :
                System.out.println("One"); break;
            default:
                System.out.println("Below 2 numbers."); break;
        }
    }
}
