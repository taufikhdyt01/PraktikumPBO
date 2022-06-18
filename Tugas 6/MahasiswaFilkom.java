package com.company;

public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;
    private static int totalMahasiswa;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        setNIM(NIM);
        setIPK(IPK);
        totalMahasiswa++;
    }

    public String getNIM() {
        return NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus() {
        String angkatan = "20" +NIM.substring(0,2);
        String prodi = NIM.substring(6, 7);
        switch (prodi) {
            case "2" -> prodi = "Teknik Meniup Gelembung";
            case "3" -> prodi = "Teknik Berburu Ubur Ubur";
            case "4" -> prodi = "Sistem Perhamburgeran";
            case "6" -> prodi = "Pendidikan Chum Bucket";
            case "7" -> prodi = "Teknologi Telepon Kerang";
        }
        return prodi+ ", " +angkatan;
    }

    public double getBeasiswa() {
        if (IPK >= 3.0 && IPK < 3.5)
            return 50;
        else if (IPK >= 3.5 && IPK <= 4.0)
            return 75;
        else
            return 0;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+getBeasiswa();
    }

    public int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nIPK\t\t\t\t : " +getIPK()+ "\nNIM\t\t\t\t : " +getNIM()+ "\nStatus\t\t\t : " +getStatus();
    }

}
