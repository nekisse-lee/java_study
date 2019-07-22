package java8;

public class OopAndFpExamples {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService(new Addition(), new Subtranction());
        int additionResult = calculatorService.calculate(
            11, 4);
        System.out.println(additionResult);

        int subtractionResult = calculatorService.calculate(11, 1);
        System.out.println(subtractionResult);

        int multiplicationResult = calculatorService.calculate(11, 2);
        System.out.println(multiplicationResult);

        int divisionResult = calculatorService.calculate(20, 4);
        System.out.println(divisionResult);

        FpCalculatorService fpCalculatorService = new FpCalculatorService();
//        System.out.println("        addition: " + fpCalculatorService.fpCalculate(new Addition(), 11, 4));
        Calculation addition = (num1, num2) -> num1 + num2;
        System.out.println("        addition: " + fpCalculatorService.fpCalculate(addition, 11, 4));
//        System.out.println("     subtraction: " + fpCalculatorService.fpCalculate(new Subtranction(), 11, 1));
        System.out.println("     subtraction: " + fpCalculatorService.fpCalculate((num1, num2) -> num1-num2, 11, 1));
        System.out.println("  multiplication: " + fpCalculatorService.fpCalculate(new Multiplication(), 11, 2));
        System.out.println("        division: " + fpCalculatorService.fpCalculate(new Division(), 20, 4));
        System.out.println("     custom calc: " + fpCalculatorService.fpCalculate((num1, num2) -> ((num1+num2) * 2)/ num2, 20, 4));

    }

}

interface Calculation {
    int calculate(int num1, int num2);
}

class Addition implements Calculation {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtranction implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}

class Multiplication implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}

class Division implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 / num2;
    }
}


class CalculatorService {
    private Calculation calculation;
    private Calculation calculation2;

    public CalculatorService(Calculation calculation, Calculation calculation2) {
        this.calculation = calculation;
        this.calculation2 = calculation2;
    }

    public int calculate(int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("invalid input num1 : " + num1 + ", num2 : " + num2);
        }


//        if (calculation == '+') {
//        return num1 + num2;
//        } else if (calculation == '-') {
//            return num1 - num2;
//        } else if (calculation == '*') {
//            return num1 * num2;
//        } else if (calculation == '/') {
//            return num1 / num2;
//        } else {
//            throw new IllegalArgumentException("알수 없는 calculation: " + calculation);
//        }

    }

    public int compute(int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation2.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("invalid input num1 : " + num1 + ", num2 : " + num2);
        }
    }


}

class FpCalculatorService {
    public int fpCalculate(Calculation calculation, int num1, int num2) {

        if (num1 > 10 && num2 < num1) {
            return calculation.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("invalid input num1 : " + num1 + ", num2 : " + num2);
        }

    }
}
