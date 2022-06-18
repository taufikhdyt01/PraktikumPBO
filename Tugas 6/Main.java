package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("                     DATA MANUSIA");
        System.out.println("====================================================");
        Manusia man1 = new Manusia("Andi Maulana", "3576440504910003", true, true);
        System.out.println(man1.toString());
        System.out.println("====================================================");
        Manusia man2 = new Manusia("Rizky Noviandi", "3175031406020003", true, false);
        System.out.println(man2.toString());
        System.out.println("====================================================");
        Manusia man3 = new Manusia("Intan Sari", "3202081508960003", false, true);
        System.out.println(man3.toString());
        System.out.println("====================================================");

        System.out.println();
        System.out.println("====================================================");
        System.out.println("                   DATA MAHASISWA");
        System.out.println("====================================================");
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Putri Salsabila", "3528070109020004",false, false,"215150300111002", 4.0);
        System.out.println(mhs1.toString());
        System.out.println("====================================================");
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Angga Putra", "31730504012010005",true, false,"205150600111009", 2.8);
        System.out.println(mhs2.toString());
        System.out.println("====================================================");
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Annisa Permata", "3404071202000003",false, true,"185150200111016", 3.4);
        System.out.println(mhs3.toString());
        System.out.println("====================================================");

        System.out.println();
        System.out.println("====================================================");
        System.out.println("                    DATA PEKERJA");
        System.out.println("====================================================");
        Pekerja pkj1 = new Pekerja(9,26,"204777100016","Widodo Saputra", "3302212806900001", true, true);
        System.out.println(pkj1.toString());
        System.out.println("====================================================");
        Pekerja pkj2 = new Pekerja(6,24,"103777600007","Lidya Rahmatunnisa", "3304092402960002", false, true);
        System.out.println(pkj2.toString());
        System.out.println("====================================================");
        Pekerja pkj3 = new Pekerja(10,28,"602777700022","Ahmad Fauzan", "3321071411980003", true, false);
        System.out.println(pkj3.toString());
        System.out.println("====================================================");

        System.out.println();
        System.out.println("====================================================");
        System.out.println("                    DATA MANAJER");
        System.out.println("====================================================");
        Manajer mnj1 = new Manajer(8,25,"501777300002","Pratama Herdiansyah", "3203182204930003", true, true, 5);
        System.out.println(mnj1.toString());
        System.out.println("====================================================");
        Manajer mnj2 = new Manajer(9,27,"302777100006","Gilang Widya", "3512081202970006", true, false, 2);
        System.out.println(mnj2.toString());
        System.out.println("====================================================");
        Manajer mnj3 = new Manajer(7,22,"203777100012","Melinda Putri", "3273270803950004", false, true, 3);
        System.out.println(mnj3.toString());
        System.out.println("====================================================");

        System.out.println();
        System.out.println("====================================================");
        System.out.println("               TOTAL YANG TERDAFTAR");
        System.out.println("====================================================");
        System.out.println("Manusia\t\t\t : " +(man1.getTotalManusia()-mhs1.getTotalMahasiswa()-pkj1.getTotalPekerja())+ " Orang");
        System.out.println("Mahasiswa\t\t : " +mhs1.getTotalMahasiswa()+" Orang");
        System.out.println("Pekerja\t\t\t : " +(pkj1.getTotalPekerja()-mnj1.getTotalManajer())+ " Orang");
        System.out.println("Manajer\t\t\t : " +mnj1.getTotalManajer()+ " Orang");
        System.out.println("====================================================");
    }

}
