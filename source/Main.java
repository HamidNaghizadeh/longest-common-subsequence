package com.hamidnagizadeh;

public class Main {

    public static void main(String[] args) {

        String firstString="ABCBDAB";
        String secondString="BDCABA";

        LCS lcs=new LCS(firstString,secondString);
        lcs.print();
    }
}
