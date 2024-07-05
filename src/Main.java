import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        int weight = scanner.nextInt();

        int little = 500;
        int average = 1000;
        int lot = 1500;
        int veryMuch = 2000;

        int a4 = 4;
        int l7 = 7;
        int v9 = 9;

        double fuelMaxHave = 300;
        double rate = 0;

        if (ab > fuelMaxHave || bc > fuelMaxHave || weight > veryMuch) {
            System.out.println("ERROR");
            return;
        } else {
            if (weight <= little) {
                rate = fuelMaxHave - ab;
                rate = bc > rate ? bc - rate : 0;
            } else if (weight <= average) {
                if ((ab | bc) * a4 > (int) fuelMaxHave) {
                    System.out.println("ERROR");
                    return;
                }
                rate = fuelMaxHave - (ab * a4);
                rate = (bc * a4) > rate ? (bc * a4) - rate : 0;
            } else if (weight <= lot) {
                if ((ab | bc) * l7 > (int) fuelMaxHave) {
                    System.out.println("ERROR");
                    return;
                }
                rate = fuelMaxHave - (ab * l7);
                rate = (bc * l7) > rate ? (bc * l7) - rate : 0;
            } else {
                if ((ab | bc) * v9 > (int) fuelMaxHave) {
                    System.out.println("ERROR");
                    return;
                }
                rate = fuelMaxHave - (ab * v9);
                rate = (bc * v9) > rate ? (bc * v9) - rate : 0;
            }

        }
        System.out.printf("%.2f", rate);

    }
}