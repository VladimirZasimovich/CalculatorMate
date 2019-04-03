public class ArithmeticRealization implements Operations {
    private double firstValue;
    private double secondValue;

    public ArithmeticRealization(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public double addition() {
        return firstValue + secondValue;
    }

    @Override
    public double subtraction() {
        return firstValue - secondValue;
    }

    @Override
    public double multiplication() {
        return firstValue * secondValue;
    }

    @Override
    public double division() {
        return firstValue / secondValue;
    }

    @Override
    public String addRoman() {
        double result = firstValue + secondValue;
        String resultRoman = "";
        while (result >= 10) {
            resultRoman = resultRoman + "X";
            result = result - 10;
        }
        while (result >= 9) {
            resultRoman = resultRoman + "IX";
            result = result - 9;
        }
        while (result >= 5) {
            resultRoman = resultRoman + "V";
            result = result - 5;
        }
        while (result >= 4) {
            resultRoman = resultRoman + "IV";
            result = result - 4;
        }
        while (result >= 1) {
            resultRoman = resultRoman + "I";
            result = result - 1;
        }
        return resultRoman;
    }
    @Override
    public String subRoman() {
        double result = firstValue - secondValue;
        String resultRoman = "";
        while (result >= 10) {
            resultRoman = resultRoman + "X";
            result = result - 10;
        }
        while (result >= 9) {
            resultRoman = resultRoman + "IX";
            result = result - 9;
        }
        while (result >= 5) {
            resultRoman = resultRoman + "V";
            result = result - 5;
        }
        while (result >= 4) {
            resultRoman = resultRoman + "IV";
            result = result - 4;
        }
        while (result >= 1) {
            resultRoman = resultRoman + "I";
            result = result - 1;
        }
        return resultRoman;
    }
    @Override
    public String multRoman() {
        double result = firstValue * secondValue;
        String resultRoman = "";
        while (result >= 100) {
            resultRoman = resultRoman + "C";
            result = result - 100;
        }
        while (result >= 90) {
            resultRoman = resultRoman + "XC";
            result = result - 90;
        }
        while (result >= 50) {
            resultRoman = resultRoman + "L";
            result = result - 50;
        }
        while (result >= 40) {
            resultRoman = resultRoman + "XL";
            result = result - 40;
        }
        while (result >= 10) {
            resultRoman = resultRoman + "X";
            result = result - 10;
        }
        while (result >= 9) {
            resultRoman = resultRoman + "IX";
            result = result - 9;
        }
        while (result >= 5) {
            resultRoman = resultRoman + "V";
            result = result - 5;
        }
        while (result >= 4) {
            resultRoman = resultRoman + "IV";
            result = result - 4;
        }
        while (result >= 1) {
            resultRoman = resultRoman + "I";
            result = result - 1;
        }
        return resultRoman;
    }
     @Override
    public String divRoman() {
        double result = firstValue / secondValue;
        String resultRoman = "";
        while (result >= 10) {
            resultRoman = resultRoman + "X";
            result = result - 10;
        }
        while (result >= 9) {
            resultRoman = resultRoman + "IX";
            result = result - 9;
        }
        while (result >= 5) {
            resultRoman = resultRoman + "V";
            result = result - 5;
        }
        while (result >= 4) {
            resultRoman = resultRoman + "IV";
            result = result - 4;
        }
        while (result >= 1) {
            resultRoman = resultRoman + "I";
            result = result - 1;
        }
        return resultRoman;
    }
}