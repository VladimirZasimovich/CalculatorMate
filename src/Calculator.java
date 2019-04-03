import java.util.Scanner;

public class Calculator {

    private String operation;

    public String getOperation() {
        return operation;
    }

    public void enteredArithmeticActionArabic() {
        Scanner sc = new Scanner(System.in);
        operation = sc.nextLine();

        ListOfOperations[] operations = ListOfOperations.values();
        for (ListOfOperations selectedOption : operations) {
            if (operation.equalsIgnoreCase(selectedOption.toString())) {
                double firstValue;
                double secondValue;
                UserValues userValues = new UserValues();
                switch (selectedOption) {
                    case ADD:
                        System.out.print("Enter first value: ");
                        firstValue = userValues.enterArabicValues();
                        System.out.print("Enter second value: ");
                        secondValue = userValues.enterArabicValues();
                        ArithmeticRealization calc = new ArithmeticRealization(firstValue, secondValue);
                        System.out.println(calc.addition());
                        break;
                    case SUB:
                        System.out.print("Enter first value: ");
                        firstValue = userValues.enterArabicValues();
                        System.out.print("Enter second value: ");
                        secondValue = userValues.enterArabicValues();
                        ArithmeticRealization calc2 = new ArithmeticRealization(firstValue, secondValue);
                        System.out.println(calc2.subtraction());
                        break;
                    case MULT:
                        System.out.print("Enter first value: ");
                        firstValue = userValues.enterArabicValues();
                        System.out.print("Enter second value: ");
                        secondValue = userValues.enterArabicValues();
                        ArithmeticRealization calc3 = new ArithmeticRealization(firstValue, secondValue);
                        System.out.println(calc3.multiplication());
                        break;
                    case DIV:
                        System.out.print("Enter first value: ");
                        firstValue = userValues.enterArabicValues();
                        System.out.print("Enter second value: ");
                        secondValue = userValues.enterArabicValues();
                        ArithmeticRealization calc4 = new ArithmeticRealization(firstValue, secondValue);
                        System.out.println(calc4.division());
                        break;
                    case EX: break;
                }
            }
        }
    }
    public void enteredArithmeticActionRoman() {
        Scanner sc = new Scanner(System.in);
        operation = sc.nextLine();
        System.out.println("Warning! The calculator works only with roman numerals from I to X in upper case!");
        ListOfOperations[] operations = ListOfOperations.values();
        for (ListOfOperations selectedOption : operations) {
            if (operation.equalsIgnoreCase(selectedOption.toString())) {
                double firstValue;
                double secondValue;
                UserValues userValues = new UserValues();
                switch (selectedOption) {
                    case ADD:
                        System.out.print("Enter first value: ");
                        firstValue = userValues.enteredRomanValues();
                        System.out.print("Enter second value: ");
                        secondValue = userValues.enteredRomanValues();
                        ArithmeticRealization calc = new ArithmeticRealization(firstValue, secondValue);
                        System.out.println(calc.addRoman());
                        break;
                    case SUB:
                        System.out.print("Enter first value: ");
                        firstValue = userValues.enteredRomanValues();
                        System.out.print("Enter second value: ");
                        secondValue = userValues.enteredRomanValues();
                        ArithmeticRealization calc2 = new ArithmeticRealization(firstValue, secondValue);
                        System.out.println(calc2.subRoman());
                        break;
                    case MULT:
                        System.out.print("Enter first value: ");
                        firstValue = userValues.enteredRomanValues();
                        System.out.print("Enter second value: ");
                        secondValue = userValues.enteredRomanValues();
                        ArithmeticRealization calc3 = new ArithmeticRealization(firstValue, secondValue);
                        System.out.println(calc3.multRoman());
                        break;
                    case DIV:
                        System.out.print("Enter first value: ");
                        firstValue = userValues.enteredRomanValues();
                        System.out.print("Enter second value: ");
                        secondValue = userValues.enteredRomanValues();
                        ArithmeticRealization calc4 = new ArithmeticRealization(firstValue, secondValue);
                        System.out.println(calc4.divRoman());
                        break;
                    case EX: break;
                }
            }
        }
    }
}