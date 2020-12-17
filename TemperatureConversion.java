/*TemperatureCoversion converts 
temperatures between kelvin, 
fahrenheit, and celsius

By Alex Free

Last updated 9/22/20 */

public class TemperatureConversion{
   public static void main(String[] args){
   /*takes numbers and converts them to other temperatures
    
   Inputs: fInitial (double): fahrenheit user value
           cInitial (double): celsius user value
           kInitial (double): kelvin user value
           
   Outputs: StdOut: prints the numbers after conversion
   
   */
   //getting input from user (F)
   StdOut.println("What is the fahrenheit number you would like to convert?");
   Double fInitial = StdIn.readDouble();
   //getting input from user (C)
   StdOut.println("What is the celsius number you would like to convert?");
   Double cInitial = StdIn.readDouble();
   //getting input from user (K)
   StdOut.println("What is the kelvin number you would like to convert?");
   Double kInitial = StdIn.readDouble();
   //conversions using variables
   Double f1;
   f1 = (fInitial - 32) *5/9;
   Double f2 = (fInitial-32)*5/9+273.15;
   Double c1 = (cInitial*9/5)+32;
   Double c2 = cInitial+273.15;
   Double k1 = (kInitial - 273.15)* 1.8+ 32;
   Double k2 = kInitial - 273.15;
   //fahrenheit output
   StdOut.println("Fahrenheit conversions: C: " + f1 + " K: " + f2);
   //celsius outputs
   StdOut.println("Celsius conversions: F: " + c1 + " K: " + c2);
   //kelvin output
   StdOut.println("Kelvin conversions: F: " + k1 + " C: " + k2);
   }




}