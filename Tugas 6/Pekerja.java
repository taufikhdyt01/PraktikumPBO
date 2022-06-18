package com.company;

public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    private static int totalPekerja;

    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        setJamKerja(jamKerja);
        setHariKerja(hariKerja);
        setNIP(NIP);
        totalPekerja++;
    }

    public double getGaji() {
        gaji = getHariKerja() * getJamKerja() * 15;
        return gaji;
    }

    public double getBonus() {
        double bonusLembur = (((getHariKerja() / 7) * 5) + getHariKerja() % 7) * (getJamKerja() - 7) * 7;
        double bonusLibur = ((getHariKerja() / 7) * 2) * (getJamKerja()) * 20;
        if (getJamKerja() > 7) {
            bonus = bonusLembur + bonusLibur;
        } else {
            bonus = bonusLibur;
        }
        return bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus() {
        String departemen = NIP.substring(6,7);
        String kantor = NIP.substring(0,1);
        String cabang = " cabang ke-" +NIP.charAt(2);
        switch (departemen) {
            case "1" -> departemen = "Pemasaran";
            case "2" -> departemen = "Humas";
            case "3" -> departemen = "Riset";
            case "4" -> departemen = "Teknologi";
            case "5" -> departemen = "Personalia";
            case "6" -> departemen = "Akademik";
            case "7" -> departemen = "Administrasi";
            case "8" -> departemen = "Operasional";
            case "9" -> departemen = "Pembangunan";
        }
        switch (kantor) {
            case "1" -> kantor = "Mondstadt";
            case "2" -> kantor = "Liyue";
            case "3" -> kantor = "Inazuma";
            case "4" -> kantor = "Sumeru";
            case "5" -> kantor = "Fontaine";
            case "6" -> kantor = "Natlan";
            case "7" -> kantor = "Snezhnaya";
        }
        return departemen+ ", " +kantor+ " " +cabang;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+getGaji()+getBonus();
    }

    public int getTotalPekerja() {
        return totalPekerja;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nBonus\t\t\t : " +getBonus()+"$"+ "\nGaji\t\t\t : " +getGaji()+"$"+
                "\nNIP\t\t\t\t : " +getNIP()+ "\nStatus\t\t\t : " +getStatus();
    }

}
