/*Spyname takes information from the user and makes it into a spy name
By Alex Free

Last updated 9/28/20 */

public class SpyName{
   public static void main(String[] args){
   /*takes info and makes a spy name
   Inputs: String fullName - full name no spaces
           Integer firstName - amount of letters in first name
           Integer middleName - amount of letters in middle name
           street - birth street address no spaces
           suffix - street suffix
           
   Outputs: StdOut: prints the final codename
   
   */
   
   StdOut.println("full name (no spaces)");
   String fullName = StdIn.readString();
   StdOut.println("how many letters is your first name");
   Integer firstName = StdIn.readInt();
   StdOut.println("how many letters is your middle name");
   Integer middleName = StdIn.readInt();
   StdOut.println("what address were you born at (no spaces)");
   String street = StdIn.readString();
   StdOut.println("what suffix");
   String suffix = StdIn.readString();
   String name1 = fullName.substring(firstName, firstName + middleName);
   String name2 = street.substring(0, street.length()-suffix.length());
   
   
   StdOut.print("Your super secret spy name is: " + name1 + " " + name2);
   
   }




}