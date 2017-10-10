package calculator;

/**
 *
 * @author gavin17
 */

import java.util.Scanner;

public class Calculator 
{
    Calculate calculate1 = new Calculate();
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
                double solution = Calculate.add(value1, value2);
                System.out.println(solution);
            }else if(opperation.equals("subtract")){
                double solution = Calculate.subtract(value1, value2);
                System.out.println(solution);
            }else if(opperation.equals("multiply")){
                double solution = Calculate.multiply(value1, value2);
                System.out.println(solution);
            }else if(opperation.equals("divide")){
                double solution = Calculate.divide(value1, value2);
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