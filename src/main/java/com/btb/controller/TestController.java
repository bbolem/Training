package com.btb.controller;

public class TestController {
    public static void main(String[] args) {
        System.out.println("Welcome to java!");
        System.out.println(args[0]);
        System.out.println(args[1]);

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        System.out.println(i + j);

    }
}