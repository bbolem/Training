package com.btb.controller;
public class WhileEx {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = 0;

//        while (j <= i){
//            System.out.print(j++ + " ");
//        }

        do {
            System.out.print(j++ + " ");
        } while (j < i);
    }
}
