

import java.util.Scanner;

public class Bugged_04_LeTony
{
    public static void main(String[] args) 
   {
         System.out.println("Welcome to the Currency Converter.\n");
         System.out.println("Please choose an option:\n");
         System.out.println("1. Dollars to Euros\n");
         System.out.println("2. Euros to Dollars\n");
         System.out.println("3. Exit\n"); 
         
         Scanner k =  new Scanner(System.in);
         int currency = k.nextInt();

         switch (currency)
         {
            case 1 -> dollarsToEuros();
            case 2 -> eurosToDollars();
            case 3 -> System.out.println("Thank you for using the Currency Converter.\n");
            default -> System.out.println("Invalid option. Please try again.\n");
         }

    }

        
        
        public static void dollarsToEuros() 
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
        }

        public static void eurosToDollars() 
        {
                Scanner k = new Scanner(System.in);
        double dollars, feeP, fAmount, conversionRate, eurosPerDollar, grossEuros, rate, fee, netEuros; 

        System.out.println("Welcome to the Euros to dollars Converter.\n");

        System.out.print("How many euros do you want to convert? ");        
        dollars = k.nextDouble();   

        System.out.println("What is the conversion of the euros to dollars.\n");
        conversionRate = k.nextDouble();

        System.out.print("What is the dollars-per-euro exchange rate? ");            

        eurosPerDollar = conversionRate;

        grossEuros = dollars * eurosPerDollar; 

        System.out.println(dollars + " Euros => " + grossEuros + " Gross Dollars.");

        System.out.print("\nWhat is the dollars-per-euro Fee Percentage % ? ");        
        rate = k.nextDouble();  

        fAmount = grossEuros * rate / 100;

        netEuros = grossEuros - fAmount;

	System.out.println("Thank you for using the Euros to Dollars Converter.\n");

	System.out.println("Please check your Math.\n");

        System.out.println(dollars + " \tEuros\n " + 
                eurosPerDollar + " \tDollars Per Euro Exchange Rate\n" +
                grossEuros + " \tGross Dollars\n" +
                rate + " \tFee Percentage %\n" +
                fAmount + " \tFee in Dollars\n" +
                netEuros + " \tNet Dollars\n");

        }
}
