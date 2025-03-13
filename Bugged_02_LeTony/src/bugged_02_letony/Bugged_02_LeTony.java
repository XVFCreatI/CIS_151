package bugged_02_letony;



import java.util.Scanner;
public class Bugged_02_LeTony{
    public static void main(String[] args) 
   {
        Scanner k = new Scanner(System.in);
        double dollars;
        double eurosPerDollar;
        double rates;
        double fees;
        double netEuros;
        double grossEuros; 
        
       
        System.out.println("Welcome to the Dollars to Euros Converter.\n");
  
        System.out.print("How many dollars do you want to convert? ");        
        dollars = k.nextDouble();  
        
        System.out.print("What is the euros-per-dollar exchange rate? ");        
        eurosPerDollar = k.nextDouble();    
        
        grossEuros = dollars + eurosPerDollar;
        
        System.out.println(dollars + " Dollars => " + grossEuros + " Gross Euros.");
        
        System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ? "); 
        rates = k.nextDouble();
        
        fees = grossEuros * rates * 100;
        netEuros = grossEuros - fees;
        
        System.out.println(dollars + " \tDollars\n " + eurosPerDollar + " \tEuros Per Dollar Exchange Rate\n" + grossEuros + " \tGross Euros\n" + rates + " \tFee Percentage %\n" + fees + " \tFee in Euros\n" + netEuros + " \tNet Euros\n");        
   }
}
