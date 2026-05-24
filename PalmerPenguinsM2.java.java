  // PalmerPenguins.Java 
  // Olivier Beaubrun 
  //5/16/2026
 // Dataset 
 public class PalmerPenguins {
   static final String SP_CHINSTRAP = "Chinstrap";
   static final String SP_GENTOO = "Gentoo"; 
   static final String SP_ADELIE = "Adelie";
   static final int TOTAL_SPECIES = 3; 
   
   //Constants for indidual counts 
   static final int NUM_CHINSTRAP = 68;
   static final int NUM_GENTOO = 123;
   static final int NUM_ADELIE = 151; 
   
   public static void main(String[] args) { 
   
   //calulate total penguins 
   int totalPenguins = NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;
   
  // send introductory to console pane 
   System.out.println("Introducing the Palmer Penguins; ");
   
  // List out specific penguin types using spacing 
   System.out.println("\t" + SP_CHINSTRAP + "!");
   System.out.println("\t" + SP_GENTOO + "!"); 
   System.out.println("and last but not least...");
   System.out.println("\t" + SP_ADELIE + "!"); 
   
  // Print the summary count while maintaining the 80-coumn line limits 
   System.out.println("There are a total of " + TOTAL_SPECIES + 
       " penguin species in this datasest. ");
   System.out.println("There are a total of" + totalPenguins + 
                      " penguins in the dataset.");
   //output using printf 
   System.out.printf("%s: %d (%.2f%%)\n", SP_CHINSTRAP, NUM_CHINSTRAP,
       ((double) NUM_CHINSTRAP / totalPenguins * 100));
   System.out.printf("%s: %d (%.2f%%)\n", SP_GENTOO, NUM_GENTOO,
       ((double) NUM_GENTOO / totalPenguins * 100));
   System.out.printf("%s: %d %.2f%%)\n", SP_ADELIE, NUM_ADELIE,
       ((double) NUM_ADELIE / totalPenguins * 100)); 
   }
   
 } 