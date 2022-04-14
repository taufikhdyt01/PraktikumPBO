package com.company;

public class Main {

    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "080000000000");
        CarRider youhan = new CarRider("Bei Youhan", 20, "081111111111");
        CarRider ling = new CarRider("Ling'er", 31, "081222222222");
        CarRider fang = new CarRider("Fang Yin", 25, "085555555555");

        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");
        data.addCar("MPV", "N 4444 AB", "Toyota");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);
        arsip.Rent(fang, data.carList.get(0), 5);

        System.out.println("");
        arsip.info();
    }

}
