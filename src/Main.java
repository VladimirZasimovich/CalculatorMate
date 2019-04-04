import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choseCalc;

        Calculator arabicCalculator = new Calculator();
        Calculator romanCalculator = new Calculator();
        do {
            System.out.println("Chose calculator: ARABIC or ROM and enter it to the console");
            Scanner sc = new Scanner(System.in);
            choseCalc = sc.nextLine();

            System.out.println("Chose your operation and enter it to the console:");
            System.out.print("add - addition; ");
            System.out.print("sub - subtraction; ");
            System.out.println("mult - multiplication; ");
            System.out.print("div - division; ");
            System.out.println("ex - exit.");
            System.out.println("----------------------------------------------------------");

            if (choseCalc.equalsIgnoreCase("ARABIC")) {
                arabicCalculator.enteredArithmeticActionArabic();
            } else if (choseCalc.equalsIgnoreCase("ROM")) {
                romanCalculator.enteredArithmeticActionRoman();
            } else
                break;
        } while (!choseCalc.equalsIgnoreCase("ex")
                || !arabicCalculator.getOperation().equalsIgnoreCase("ex")
                || !arabicCalculator.getOperation().equalsIgnoreCase("ex"));
    }
}
