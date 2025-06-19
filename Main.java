package com.laptop;
 
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Laptop: ");
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        Laptop laptop;
        switch (choice) {
            case 1:
                laptop = new Lenovo();
                break;
            case 2:
                laptop = new Toshiba();
                break;
            case 3:
                laptop = new MacBook();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        LaptopUser user = new LaptopUser(laptop);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("ON - Nyalakan Laptop");
            System.out.println("OFF - Matikan Laptop");
            System.out.println("UP - Tambah Volume");
            System.out.println("DOWN - Kurangi Volume");
            System.out.println("EXIT - Keluar");
            System.out.print("Masukkan perintah: ");
            String command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.increaseVolume();
                    break;
                case "DOWN":
                    user.decreaseVolume();
                    break;
                case "EXIT":
                    running = false;
                    break;
                default:
                    System.out.println("Perintah tidak dikenali!");
            }
        }
        scanner.close();
    }
}