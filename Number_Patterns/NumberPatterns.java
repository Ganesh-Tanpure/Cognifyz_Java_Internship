import java.util.Scanner;

public class NumberPatterns {
    public static void main(String[] args) {

        Scanner ch = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Enter the choice to print the pattern: "
                    + "\n" + "1.Right angle triangle pattern"
                    + "\n" + "2.Inverted Right-Angle Triangle Pattern"
                    + "\n" + "3.Pyramid Number Pattern"
                    + "\n" + "4.Inverted Pyramid Number Pattern"
                    + "\n" + "5.Diamond Number Pattern"
                    + "\n" + "6.Palindromic Number Pattern"
                    + "\n" + "7.Hollow Diamond Number Pattern"
                    + "\n" + "8.Exit");
            choice = ch.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int n = 5;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print(k + 1);
                        }
                        for (int l = i - 1; l >= 0; l--) {
                            System.out.print(l + 1);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int p = 5;
                    for (int i = p; i >= 1; i--) {
                        for (int j = p; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k < (i * 2); k++) {
                            System.out.print(k);
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    int d = 5;
                    for (int i = 1; i <= d; i++) {
                        for (int j = i; j < d; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k < (i * 2); k++) {
                            System.out.print(k);
                        }
                        System.out.println();
                    }
                    for (int i = d - 1; i >= 1; i--) {
                        for (int j = d; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k < (i * 2); k++) {
                            System.out.print(k);
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    p = 5;
                    for (int i = 1; i <= p; i++) {
                        for (int j = i; j < p; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k < i; k++) {
                            System.out.print(k);
                        }
                        for (int l = i; l >= 1; l--) {
                            System.out.print(l);
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    n = 5;
                    for (int i = 1; i <= n; i++) {
                        for (int j = i; j < n; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            if (k == 1 || k == (2 * i - 1)) {
                                System.out.print(1);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    for (int i = n - 1; i >= 1; i--) {
                        for (int j = n; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            if (k == 1 || k == (2 * i - 1)) {
                                System.out.print(1);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
        } while (choice != 8);

    }
}
