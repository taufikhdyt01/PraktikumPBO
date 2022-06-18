package com.company;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    private static int totalManusia;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        setNama(nama);
        setNIK(NIK);
        setJenisKelamin(jenisKelamin);
        setMenikah(menikah);
        totalManusia++;
    }

    public String getNama() {
        return nama;
    }

    public String getNIK() {
        return NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (isMenikah() && isJenisKelamin())
            return 25;
        else if (isMenikah() && !isJenisKelamin())
            return 20;
        else
            return 15;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public int getTotalManusia() {
        return totalManusia;
    }

    @Override
    public String toString() {
        return "Nama\t\t\t : " +getNama()+ "\nNIK\t\t\t\t : " +getNIK()+
                "\nJenis Kelamin\t : " +(isJenisKelamin()?"Laki-Laki":"Perempuan")+
                "\nPendapatan\t\t : " +getPendapatan()+"$";
    }

}
