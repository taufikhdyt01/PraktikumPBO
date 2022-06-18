package Polymorphism;

public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        setUpah(upah);
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public String toString() {
        return "Pegawai Tetap\t: " +getNama()+ "\nNo. KTP\t\t\t: " +getNoKTP()+
                "\nUpah\t\t\t: " +getUpah()+ "\nPendapatan\t\t: Rp " +(int) gaji();
    }

    @Override
    public double gaji() {
        return getUpah();
    }

}
