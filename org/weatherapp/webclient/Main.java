package org.weatherapp.webclient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Dodawanie lokalizacji");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("5. Zakończ aplikację.");
            choice =scanner.nextInt();

            switch (choice){
                case 1:

                    System.out.println("Podaj miasto");
                    String city = scanner.next();

                    System.out.println("Podaj kraj");
                    String country = scanner.next();
                    System.out.println("Podaj szerokość geograficzną");
                    double lat = scanner.nextDouble();
                    System.out.println("Podaj długość geograficzną");
                    double lon = scanner.nextDouble();

            }
        }while (choice !=5);
        scanner.close();

    }
}
