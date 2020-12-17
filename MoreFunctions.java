/*author : alex free
Morefunctions is a program to use heron's theorem and 
calculate interest over time
last updated: 9/29/20 */

public class MoreFunctions{
   public static double triangle(double a, double b,  double c){
   //inputs: sides a, b, and c
   //returns area of triangle
   double s = (a+b+c)/2;
   double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
   return area; }
   
   
   public static double invest(double p, double r, double n, double t){
     /*inputs: p (principal investment)
               r (rate of return in decimal EX: 0.05 for 5%)
               n (times compounded per year)
               t ( time )
      returns investment after the time specified given the inputs    
               
     */double nt = n*t; 
     double middle = 1 + ( r / n);
     double increase = Math.pow(middle,nt);
   return p*increase; }
}

       



