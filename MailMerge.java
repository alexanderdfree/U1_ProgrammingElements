/* A program to generate advertisement emails 
to companies.

by Alex Free

Last modified 9/20/20*/

public class MailMerge {
   public static void main(String[] args) {
   //main method and creates the email
   //descriptions of variables are in the strings
   String firstRec = "First Name of Recipient";
   String lastRec = "last name of recipient";
   String companyRec = "company of recipient";
   String firstMar = "first name of marketer";
   String lastMar = "last name of marketer";
   String emailMar = "email of marketer";
   //actual text
   StdOut.println("Subject: Deals for " + companyRec);
   StdOut.println("Dear " + firstRec + " " + lastRec + " from " + companyRec + ",");
   StdOut.println("I noticed that " + companyRec + " was lacking an effective source of food for");
   StdOut.println("their workers and know that GreatFood can be of assistance");
   StdOut.println("We can handle all of your catering needs.");
   StdOut.println("Best Regards,");
   StdOut.println(firstMar + " " + lastMar + " from GreatFood");
   StdOut.println(emailMar);
   
   }

}