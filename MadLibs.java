/*MadLibs is a funny program to make word jokes with friends.

By Alex Free

Last updated 9/22/20 */

public class MadLibs{
   public static void main(String[] args){
   /*takes words and makes mad libs with them
   Inputs: String noun1: noun input 1 for madlib
           String noun2: noun input 2 for madlib
           String verb1: verb input 1 for madlib
           String verb2: verb input 2 for madlib
           String adj1: adjective input 1 for madlib
           String adj2: adjective input 2 for madlib
           String pronoun: pronoun input for madlib (ends with m)
           
   Outputs: StdOut: prints the final mad lib
   
   */
   
   StdOut.println("Adjective?");
   String adj1 = StdIn.readString();
   StdOut.println("Adjective?");
   String adj2 = StdIn.readString();
   StdOut.println("Noun?");
   String noun1 = StdIn.readString();
   StdOut.println("Noun?");
   String noun2 = StdIn.readString();
   StdOut.println("Verb");
   String verb1 = StdIn.readString();
   StdOut.println("Verb");
   String verb2 = StdIn.readString();
   StdOut.println("Pronoun (him/her/them, etc.)");
   String pronoun = StdIn.readString();
   
   
   
   StdOut.print("The " + adj1 + " and " + adj2 + " " + noun1 + " " + verb1 + " and " + verb2 + " with " + noun2 + ", which made " + pronoun + " happy.");
   
   }




}