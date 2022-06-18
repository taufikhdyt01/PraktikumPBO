package Polymorphism;

public class Main {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("         DATA PEGAWAI TETAP");
        System.out.println("====================================");
        Pegawai pegawai1 = new PegawaiTetap("Bayu", "3576440504910003", 2000000);
        System.out.println(pegawai1.toString());
        System.out.println("====================================");
        Pegawai pegawai2 = new PegawaiTetap("Andi", "3175031406020003", 1500000);
        System.out.println(pegawai2.toString());
        System.out.println("====================================");
        Pegawai pegawai3 = new PegawaiTetap("Intan", "3202081508960003", 2500000);
        System.out.println(pegawai3.toString());
        System.out.println("====================================");

        System.out.println();
        System.out.println("====================================");
        System.out.println("         DATA PEGAWAI HARIAN");
        System.out.println("====================================");
        Pegawai pegawai4 = new PegawaiHarian("Edo", "3528070109020004", 8500, 40);
        System.out.println(pegawai4.toString());
        System.out.println("====================================");
        Pegawai pegawai5 = new PegawaiHarian("Putri", "31730504012010005", 7500, 45);
        System.out.println(pegawai5.toString());
        System.out.println("====================================");
        Pegawai pegawai6 = new PegawaiHarian("Angga", "3404071202000003", 9500, 38);
        System.out.println(pegawai6.toString());
        System.out.println("====================================");

        System.out.println();
        System.out.println("====================================");
        System.out.println("             DATA SALES");
        System.out.println("====================================");
        Pegawai pegawai7 = new Sales("Tika", "3302212806900001", 50, 50000);
        System.out.println(pegawai7.toString());
        System.out.println("====================================");
        Pegawai pegawai8 = new Sales("Gilang", "3304092402960002", 60, 55000);
        System.out.println(pegawai8.toString());
        System.out.println("====================================");
        Pegawai pegawai9 = new Sales("Lidya", "3321071411980003", 40, 60000);
        System.out.println(pegawai9.toString());
        System.out.println("====================================");
    }

}