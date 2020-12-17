/*Psychiatrist helps people know more about their feelings

By Alex Free

Last updated 9/22/20 */

public class Psychiatrist{
   public static void main(String[] args){
   /*asks the user about how they are feeling,
   then ask them how they feel about that. 
   Then tell them how they are feeling.
   
   Inputs: String feeling1: how they are feeling
           String feeling2: how they feel about that
   Outputs: StdOut: prints how the user is feeling
   
   */
   
   StdOut.println("How are you feeling right now?");
   String feeling1 = StdIn.readString();
   
   StdOut.println("How do you feel about that?");
   String feeling2 = StdIn.readString();
   StdOut.print("It sounds like you are feeling ");
   StdOut.print(feeling2);
   StdOut.print(" about feeling ");
   StdOut.print(feeling1);
   StdOut.print(" right now.");
   }




}