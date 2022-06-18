package Polymorphism;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        setPenjualan(penjualan);
        setKomisi(komisi);

    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public String toString() {
        return "Sales\t\t\t: " +getNama()+ "\nNo. KTP\t\t\t: " +getNoKTP()+
                "\nTotal Penjualan\t: " +getPenjualan()+ "\nBesaran Komisi\t: " +getKomisi()+
                "\nPendapatan\t\t: Rp " +(int) gaji();
    }

    @Override
    public double gaji() {
        double pendapatan = (getPenjualan() * getKomisi());
        return pendapatan;
    }

}