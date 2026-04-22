/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ASUS VIVOBOOK
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PILIH LAPTOP ===");
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();
        input.nextLine();

        Laptop laptop;

        if (pilih == 1) {
            laptop = new Lenovo();
        } else if (pilih == 2) {
            laptop = new Toshiba();
        } else {
            laptop = new MacBook();
        }

        LaptopUser nanda = new LaptopUser(laptop);

        String command;

        do {
            System.out.println("\nKetik perintah: ON | OFF | UP | DOWN | EXIT");
            System.out.print("Input: ");
            command = input.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    nanda.turnOnLaptop();
                    break;
                case "OFF":
                    nanda.turnOffLaptop();
                    break;
                case "UP":
                    nanda.makeLaptopLouder();
                    break;
                case "DOWN":
                    nanda.makeLaptopSilence();
                    break;
                case "EXIT":
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Perintah tidak dikenali!");
            }

        } while (!command.equals("EXIT"));

        input.close();
    }
}