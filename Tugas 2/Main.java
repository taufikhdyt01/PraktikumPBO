package com.company;

import java.io.*;
import java.util.*;

class Persegi {
    int sisi;

    void setSisi(int sisi) {
        this.sisi = sisi;
    }

    int luas() {
        return sisi * sisi;
    }
}

class Segitiga {
    int alas;
    int tinggi;

    void setAlas(int alas) {
        this.alas = alas;
    }

    void settingggi(int tinggi) {
        this.tinggi = tinggi;
    }

    int luas() {
        return alas * tinggi * 1 / 2;
    }
}

class Lingkaran {
    int jari;

    void setJari(int jari) {
        this.jari = jari;
    }

    double luas() {
        if (jari % 7 == 0) {
            return 22 / 7 * jari * jari;
        } else {
            double luas = 3.14 * jari * jari;
            return (int) luas;

        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte menu = input.nextByte();
        switch (menu) {
            case 1:
                Persegi persegi1 = new Persegi();
                persegi1.setSisi(input.nextInt());
                System.out.println(persegi1.luas());
                break;
            case 2:
                Segitiga segitiga1 = new Segitiga();
                segitiga1.setAlas(input.nextInt());
                segitiga1.settingggi(input.nextInt());
                System.out.println(segitiga1.luas());
                break;
            case 3:
                Lingkaran lingkaran1 = new Lingkaran();
                lingkaran1.setJari(input.nextInt());
                System.out.println(lingkaran1.luas());
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}
