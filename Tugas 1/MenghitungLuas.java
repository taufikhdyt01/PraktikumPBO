package com.company;

import java.io.*;
import java.util.*;

public class MenghitungLuas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte menu = input.nextByte();
        if (menu == 1) {
            byte sisi = input.nextByte();
            System.out.println(persegi(sisi));
        }
        if (menu == 2) {
            byte alas = input.nextByte();
            byte tinggi = input.nextByte();
            System.out.println(segitiga(alas, tinggi));
        }
        if (menu == 3) {
            byte jari = input.nextByte();
            System.out.println(lingkaran(jari));
        }
        if (menu < 1 || menu > 3){
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }

    public static int persegi(byte s) {
        int l = s * s;
        return l;
    }

    public static int segitiga(byte a, byte t) {
        int l = a * t * 1/2;
        return l;
    }

    public static double lingkaran(byte r) {
        if (r % 7 == 0) {
            double l = 22/7 * r * r;
            return l;
        } else {
            double l = 3.14 * r * r;
            int luas = (int) l;
            return luas;
        }
    }
}

