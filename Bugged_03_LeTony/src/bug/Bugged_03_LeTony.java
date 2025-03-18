

import java.util.Scanner;

public class Bugged_03_LeTony{
    public static void main(String[] args) 
   {
        Scanner k = new Scanner(System.in);
        double dollars, feeP, fAmount, conversionRate, eurosPerDollar, grossEuros, rate, fee, netEuros; 
        

        System.out.println("Welcome to the Dollars to Euros Converter.\n");

        System.out.print("How many dollars do you want to convert? ");        
        dollars = k.nextDouble();   

        System.out.println("What is the conversion of the dollars to euros.\n");
        conversionRate = k.nextDouble();

        System.out.print("What is the euros-per-dollar exchange rate? ");            

        eurosPerDollar = conversionRate;

        grossEuros = dollars * eurosPerDollar; 

        System.out.println(dollars + " Dollars => " + grossEuros + " Gross Euros.");

        System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ? ");        
        rate = k.nextDouble();  

        fAmount = grossEuros * rate / 100;

        netEuros = grossEuros - fAmount;

	System.out.println("Thank you for using the Dollars to Euros Converter.\n");

	System.out.println("Please check your Math.\n");

        System.out.println(dollars + " \tDollars\n " + 
                eurosPerDollar + " \tEuros Per Dollar Exchange Rate\n" +
                grossEuros + " \tGross Euros\n" +
                rate + " \tFee Percentage %\n" +
                fAmount + " \tFee in Euros\n" +
                netEuros + " \tNet Euros\n");        
        
        k.close();
    }   
}
