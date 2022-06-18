package com.company;

public class Manajer extends Pekerja{
    private int lamaKerja;
    private static int totalManajer;

    public Manajer(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        setLamaKerja(lamaKerja);
        totalManajer++;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (super.getTunjangan() * 15/100);
    }

    @Override
    public double getBonus() {
        return super.getBonus() + (super.getBonus() * 30/100);
    }

    public int getTotalManajer() {
        return totalManajer;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nLama Kerja\t\t : " +getLamaKerja()+ " tahun";
    }

}
