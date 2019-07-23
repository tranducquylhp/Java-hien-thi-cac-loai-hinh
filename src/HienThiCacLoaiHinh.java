import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    ;
                }
                break;
            case 2:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 5; j++) {
                        if (i <= j) {
                            System.out.print("*");
                        } else System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 5; j++) {
                        if (i >= j) {
                            System.out.print("*");
                        } else System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i <= 5; i++) {
                    for (int j = 5; j >= 0; j--) {
                        if (i <= j) {
                            System.out.print("*");
                        } else System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i <= 5; i++) {
                    for (int j = 5; j >= 0; j--) {
                        if (i >= j) {
                            System.out.print("*");
                        } else System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {

                    for (int j = 0; j < 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 2 - i; j <= 2 + i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }
    }
}

