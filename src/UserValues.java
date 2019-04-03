import java.util.Scanner;

public class UserValues {
    public double enterArabicValues() {

        Scanner sc = new Scanner(System.in);
        double value = 0;

            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
            } else {
                System.out.println("Incorrect format number");

            }return value;
    }

    public int enteredRomanValues() {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        switch (letter) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new NumberFormatException("Illegal number" + letter);
        }
    }
}



