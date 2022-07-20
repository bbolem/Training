package com.btb.controller;
public class ForLoopEx {
    public static void main(String[] args) {
//        int i = Integer.parseInt(args[0]);
//        int j = Integer.parseInt(args[1]);
//        for (; i < j; i++){
//            System.out.print(i + " ");
//        }

//        for (String str : args){
//            System.out.println(str);
//        }

        for (int i = 1; i <= 5; i++){
            System.out.println();
            System.out.println(i);
            for (int j = 1; j < 3; j++){
                if (j > 1){
                    break;
                }
                System.out.print(j + " ");
            }
        }
    }
}