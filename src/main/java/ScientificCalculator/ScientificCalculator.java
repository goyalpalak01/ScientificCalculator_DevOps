package ScientificCalculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ScientificCalculator {

    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class);
    public ScientificCalculator() {
    }

    public static void main(String []args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        ScientificCalculator cal = new ScientificCalculator();

        do {
            System.out.println("************* SCIENTIFIC CALCULATOR *************");
            System.out.println("What do you want to perform?");
            System.out.println("1. Factorial" + "\n" + "2. Exponentiation" + "\n" + "3. Natural Logarithm" + "\n" + "4. Square Root" + "\n" + "Press any other number to EXIT");
            System.out.print("\n" + "Enter your choice: ");

            try{
                choice = sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                logger.error("[Invalid choice] - Entered choice is not a number");
                return;
            }

            switch (choice) {
                case 1:
                    // factorial
                    int num;
                    System.out.println("\n********** FACTORIAL ***********");
                    System.out.print("Enter the number for which you want to calculate factorial : ");
                    try {
                        num = sc.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        logger.error("[Invalid number] - Entered number is not of type Integer");
                        return;
                    }
                    System.out.println("RESULT : Factorial of "+num+" = " + cal.calculateFactorial(num));
                    System.out.println("-------------------------------------------------------");
                    break;
                case 2:
                    // exponentiation
                    double base, power;
                    System.out.println("\n********** EXPONENTIATION ***********");
                    System.out.print("Enter the base : ");
                    try {
                        base = sc.nextInt();
                        System.out.print("Enter the power : ");
                        power = sc.nextInt();
                    }catch (InputMismatchException e)
                    {
                        logger.error("[Invalid input] - Entered base or power is not of type Double");
                        return;
                    }

                    System.out.println( "RESULT: "+base + " to the power of "+power+" = " + cal.calculateExp(base, power));
                    System.out.println("-------------------------------------------------------");
                    break;
                case 3:
                    // log
                    double number;
                    System.out.println("\n********** NATURAL LOGARITHM ***********");
                    System.out.print("\nEnter the number for which you want to calculate logarithm : ");
                    try{
                        number = sc.nextDouble();
                    }catch (InputMismatchException e)
                    {
                        logger.error("[Invalid number] - Entered number is not of type Double");
                        return;
                    }
                    System.out.println("RESULT : Natural Logarithm (base e) of "+number+" = "+ cal.calculateLog(number));
                    System.out.println("-------------------------------------------------------");
                    break;
                case 4:
                    // square root
                    double numVal;
                    System.out.println("\n********** SQUARE ROOT ***********");
                    System.out.print("\nEnter the number for which you want to calculate square root : ");
                    try {
                        numVal = sc.nextDouble();
                    }catch (InputMismatchException e){
                        logger.error("[Invalid number] - Entered number is not of type Double");
                        return;
                    }
                    System.out.println("RESULT : Square Root of "+numVal+ " = " + cal.calculateSqrt(numVal));
                    System.out.println("-------------------------------------------------------");

                    break;

                default:
                    logger.info("[EXIT] - Exiting from Calculator program !! ");
                    System.out.println("Exiting.....");
                    return;
            }

        } while (true);

    }


    public double calculateFactorial(int num) {

        logger.info("[FACTORIAL] - "+num);
        double result = 1;
        if(num<0)
        {
            result = Double.NaN;
            logger.error("[ERROR - FACTORIAL] - Factorial is undefined for negative numbers");
        }
        else{
            while (num != 0) {
                result = result * num;
                num--;
            }
        }

        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double calculateExp(double base, double power) {
        logger.info("[EXPONENTIATION] - "+base+" , "+power);
        double result;
        if(base==0 && power==0)
        {
            result = Double.NaN;
            logger.error("[ERROR - EXPONENTIATION] - 0 power of 0 is undefined");
        }
        else{
            result= Math.pow(base,power);
        }
        logger.info("[RESULT - EXPONENTIATION] - " + result);
        return result;
    }
    public double calculateLog(double num) {

        logger.info("[NATURAL LOGARITHM] - "+num);
        double result;
        if (num <= 0)
        {
            result = Double.NaN;
            logger.error("[ERROR - LOGARITHM] - Logarithm is undefined for negative numbers or zero");
        }
        else {
            result = Math.log(num);
        }
        logger.info("[RESULT - LOGARITHM] - " + result);
        return result;
    }
    public double calculateSqrt(double num)
    {
        logger.info("[SQUARE ROOT] - "+num);
        double result;
        if(num<0){
            result = Double.NaN;
            logger.error("[ERROR - SQUARE ROOT] - Square Root is undefined here for negative numbers");
        }
        else{
            result=  Math.sqrt(num);
        }
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }
}
