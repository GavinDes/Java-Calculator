package calculator;

/**
 *
 * @author gavin17
 */

import java.util.Scanner;

public class Calculator 
{

    public static double add(double value1, double value2)
    {
        return value1 + value2;
    }
    
    public static double subtract(double value1, double value2)
    {
        return value1 - value2;
    }
    
    public static double multiply(double value1, double value2)
    {
        return value1 * value2;
    }
    
    public static double divide(double value1, double value2)
    {
        return value1 / value2;
    }
    public static void main(String[] args) 
    {
        while(true){
            System.out.print("\nopperation\n>: ");
            Scanner input = new Scanner(System.in);
            String opperation = input.nextLine();
            System.out.print("value1\n>: ");
            double value1 = input.nextDouble();
            System.out.print("value2\n>: ");
            double value2 = input.nextDouble();
            if(opperation.equals("add")){
                double solution = add(value1, value2);
                System.out.println(solution);
            }else if(opperation.equals("subtract")){
                double solution = subtract(value1, value2);
                System.out.println(solution);
            }else if(opperation.equals("multiply")){
                double solution = multiply(value1, value2);
                System.out.println(solution);
            }else if(opperation.equals("divide")){
                double solution = divide(value1, value2);
                System.out.println(solution);
            }else{
                System.out.printf("no %s opperation\n", opperation);
                continue;
            }
            break;
        }
    }
    
}

/*
TODO: turn if statements into switch
TODO: make switch into its own method
*/