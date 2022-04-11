package com.company;

import java.io.*;
import java.util.*;

public class SuratKaisar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] teks = null;
        teks = (input.nextLine().toCharArray());
        int n = input.nextInt();
        System.out.println(hasilgeser(teks, n));

    }

    public static String hasilgeser(char[] kata, int geser) {
        char[] hurufkapital = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', +
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] huruf = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', +
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char spasi = ' ';

        String str = "";
        for (char c1 : kata) {
            for (int i = 0; i <= 25; i++) {
                if (c1 == hurufkapital[i]) {
                    i = i + (geser);
                    if (i >= 26) {
                        i = i - 26;
                    }
                    c1 = hurufkapital[i];
                    str = str + c1;
                }
                else if (c1 == huruf[i]) {
                    i = i + (geser);
                    if (i >= 26) {
                        i = i - 26;
                    }
                    c1 = huruf[i];
                    str = str + c1;
                }
            }
            if (c1 == spasi) {
                str = str + c1;
            }
        }
        return str;
    }
}