  // PalmerPenguins.Java 
  // Olivier Beaubrun 
  //5/16/2026
 // Dataset 
 public class PalmerPenguins {
   static final String SP_CHINSTRAP = "Chinstrap";
   static final String SP_GENTO = "Gento"; 
   static final String SP_ADELIE = "Adelie";
   static final int TOTAL_SPECIES = 3; 
   
   public static void main(String[] args) { 
   
  // send introductory to console pane 
   System.out.println("Introducing the Palmer Penguins; ");
   
  // List out specific penguin types using spacing 
   System.out.println("\t" + SP_CHINSTRAP + "!");
   System.out.println("\t" + SP_GENTO + "!"); 
   System.out.println("and last but not least...");
   System.out.println("\t" + SP_ADELIE + "!"); 
   
  // Print the summary count while maintaining the 80-coumn line limits 
   System.out.println("There are a total of " + TOTAL_SPECIES + 
       " penguin species in this datasest. "); 
   }
   
 } 