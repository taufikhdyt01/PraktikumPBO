package Polymorphism;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        setUpahPerJam(upahPerJam);
        setTotalJam(totalJam);

    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public String toString() {
        return "Pegawai Harian\t: " +getNama()+ "\nNo. KTP\t\t\t: " +getNoKTP()+
                "\nUpah/jam\t\t: " +getUpahPerJam()+ "\nTotal jam kerja\t: " +getTotalJam()+
                "\nPendapatan\t\t: Rp " +gaji();
    }

    @Override
    public double gaji() {
        double pendapatan;
        if(getTotalJam() <= 40) {
            pendapatan = getTotalJam() * getUpahPerJam();
        } else {
            pendapatan = ((40 * getUpahPerJam()) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5));
        }
        return pendapatan;
    }

}
