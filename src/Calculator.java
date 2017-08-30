package calculator;

/**
 *
 * @author gavin17
 */

import java.util.Scanner;

public class Calculator 
{

    public static float add(float value1, float value2)
    {
        return value1 + value2;
    }
    
    public static float subtract(float value1, float value2)
    {
        return value1 - value2;
    }
    
    public static float multiply(float value1, float value2)
    {
        return value1 * value2;
    }
    
    public static float divide(float value1, float value2)
    {
        return value1 / value2;
    }
    public static void main(String[] args) 
    {
        System.out.print("opperation\n>: ");
        Scanner input = new Scanner(System.in);
        String opperation = input.nextLine();
        System.out.print("value1\n>: ");
        Float value1 = input.nextFloat();
        System.out.print("value2\n>: ");
        Float value2 = input.nextFloat();
        if(opperation.equals("add")){
            float solution = add(value1, value2);
            System.out.println(solution);
        }else if(opperation.equals("subtract")){
            float solution = subtract(value1, value2);
            System.out.println(solution);
        }else if(opperation.equals("multiply")){
            float solution = multiply(value1, value2);
            System.out.println(solution);
        }else if(opperation.equals("divide")){
            float solution = divide(value1, value2);
            System.out.println(solution);
        }else{
            // TODO: Put continue for loop
        }
    }
    
}

/*
TODO: loop around
TODO: turn if statements into switch
TODO: make switch/if into its own method
TODO: use double rather than float
*/