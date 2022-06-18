package ExceptionHandling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int role = 0;
        int count = 0;

        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();

        while (true) {
            System.out.println("Silahkan pilih karakter yang anda inginkan :");
            System.out.println("1. Magician");
            System.out.println("2. Healer");
            System.out.println("3. Warrior");
            try {
                String pilihan = input.nextLine();
                role = Integer.parseInt(pilihan);
            }
            catch (Exception e) {
                System.out.println("Tolong masukkan angka !");
            }

            if (role > 0 && role < 4) {
                break;
            } else {
                System.out.println("Tolong pilih karakter yang tersedia !");
            }
        }

        Character player = null;
        Titan musuh = new Titan();
        System.out.printf("Selamat datang, %s ! %n", nama);
        switch (role) {
            case 1 -> {
                player = new Magician();
                player.info();
            }
            case 2 -> {
                player = new Healer();
                player.info();
            }
            case 3 -> {
                player = new Warrior();
                player.info();
            }
        }

        while (player.getHP() > 0 && musuh.getHP() > 0) {
            count++;
            System.out.printf("============ TURN %d ============ %n", count);
            if (musuh.attack()) {
                player.receiveDamage(musuh.getAttack());
            }
            if (player.attack()) {
                musuh.receiveDamage(player.getAttack());
            }
            if (count % 2 == 0 && player instanceof Healer) {
                System.out.println("Menggunakan skill Heal.");
                ((Healer) player).heal();
            }
            if (musuh.getHP() <= 0) {
                musuh.setHP(0);
            }
            if (player.getHP() <= 0) {
                player.setHP(0);
            }
            System.out.println("Enemy's HP\t: " +musuh.getHP());
            System.out.println(nama+ "'s HP\t: " +player.getHP());
        }
        System.out.println("=================================");

        if (musuh.getHP() == 0) {
            System.out.println(nama + " menang");
        } else if (player.getHP() == 0) {
            System.out.println("Musuh menang");
        }
        System.out.println();

        System.out.println("============ PLAYER ============");
        player.info();
        System.out.println();
        System.out.println("============ MUSUH =============");
        musuh.info();
    }

}
