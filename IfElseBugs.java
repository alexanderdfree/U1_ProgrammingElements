public class IfElseBugs{
   public static boolean isIt3456(int i){
      if ((i >= 3) && (i <=6)){
         if(i == 3){
            return true;
         }
         if(i == 4){
            return true;
         }
         if(i == 5){
            return true;
         }
         if(i == 6){
            return true;
         }
         else {
         return false;
      }
      }
      else {
         return false;
      }
   } 
   public static int greatest3(int a, int b, int c) {
   int greatest;
   if (a >= b){
      greatest = a;
   }
   else{
      greatest = b;  
   }
   if (greatest < c){
      greatest = c;
   }
   return greatest;
   }
   public static int greatest3_2(int a, int b, int c) {
   
   if (a > b){
      if (a > c) return a;
      else return c;
   }
   else if (b > a){
   if (b>c) return b;
   else return c;}
   else return c;
      
   }}