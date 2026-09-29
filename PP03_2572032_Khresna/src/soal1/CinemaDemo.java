// Khresna Mulia Putra 2572032
package soal1;

import java.util.Scanner;

public class CinemaDemo {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Admin admin = new Admin(cinema);
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("1. Add new film");
            System.out.println("2.View all film");
            System.out.println("3. Show longest film");
            System.out.println("4. Show shortest film");
            System.out.println("5. ExIt");
            System.out.print("Choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("Wrong menu.");
                System.out.println();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Film Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Duration: ");
                    int duration = scanner.nextInt();
                    scanner.nextLine();
                    admin.addFilm(new Film(title, duration));
                    break;
                case 2:
                    admin.viewAllFilm();
                    break;
                case 3:
                    admin.viewLongestFilm();
                    break;
                case 4:
                    admin.viewShortestFilm();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong menu");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}

