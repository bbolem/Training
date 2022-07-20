package com.btb.controller;
public class VarTypeEx {
    public static void main(String[] args) {
        VarTypeEx obj = new VarTypeEx();
        obj.testVar();
        obj.testVar2();

    }

    private void testVar(){
        int i = 5;  //local variables
        System.out.println(i);
    }

    private void testVar2(){
        int j = 6;
        System.out.println(j);
    }
}
