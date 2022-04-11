package com.company;

import java.io.*;
import java.util.*;

public class SaldoNasabah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = input.nextInt();
        int setoran = input.nextInt();
        System.out.println(saldoakhir(saldo, setoran));

    }
    public static float saldoakhir(int x, int y) {
        int saldo = x + y;
        saldo = saldo - 7000;
        float saldoakhir = (float) (saldo  + (saldo * 0.05/100));
        return saldoakhir;
    }
}