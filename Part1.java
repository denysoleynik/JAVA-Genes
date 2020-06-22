
/**
 * Write a description of class Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    
   public int findStopCodon(String dna, int startIndex, String stopCodon) {
   startIndex = dna.indexOf("ATG", startIndex);
   int curIndex = dna.indexOf(stopCodon, startIndex+3);
   while (curIndex != -1) {
   int diff = (startIndex - curIndex) %3;
   if (diff == 0) {
       return curIndex;
    }
   curIndex = dna.indexOf(stopCodon, curIndex + 1);
   }
   return dna.length();
}

public String findGene(String dna, int startIndex) {
   startIndex = dna.indexOf("ATG", startIndex);
   if (startIndex == -1) {
       return "";
       }
   int taaIndex = findStopCodon(dna, startIndex, "TAA");
   int tagIndex = findStopCodon(dna, startIndex, "TAG");
   int tgaIndex = findStopCodon(dna, startIndex, "TGA");
   int minIndex = 0;
   int tempIndex = Math.min(taaIndex, tagIndex);
   minIndex = Math.min(tempIndex, tgaIndex);
   if (minIndex == dna.length()) {
       return "";
   }
   return dna.substring(startIndex, minIndex+3);
}

public void printAllGenes(String dna) {
    int startIndex = 0;
    while (true) {
    String currentGene = findGene(dna, startIndex);
    if (currentGene.isEmpty()) {
        break;
    }
    System.out.println(currentGene);
    startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
}
}

 public void testFindStopCodon() {
 String dna = "ATGCCCCCCTAA";
 int stopCodon = findStopCodon(dna, 0, "TAA");
 System.out.println(stopCodon);
 
 dna = "ATGCCCCCTAACTAA";
 stopCodon = findStopCodon(dna, 0, "TAA");
 System.out.println(stopCodon);
 
 dna = "ATGCCCCCTAACAAA";
 stopCodon = findStopCodon(dna, 0, "TAA");
 System.out.println(stopCodon);
}


public void testFindGene(){
        String dna= "AGDEGAASZZATAAAAA";
        System.out.println("The dna string is :" + dna);
        String gene = findGene(dna, 0);
        System.out.println("Gene found is :" + gene);
        
        dna= "aaaaaaATGaaaaaaaaaTAGaaaa";
        System.out.println("The dna string is :" + dna);
        gene = findGene(dna, 0);
        System.out.println("Gene found is :" + gene);
        
        dna= "aaaaaaATGaaaaaaaaaTAGTTATGAaaa";
        System.out.println("The dna string is :" + dna);
        gene = findGene(dna, 0);
        System.out.println("Gene found is :" + gene);
        
        dna= "aaaaaaATGaaaaaaaaaAAAAaaa";
        System.out.println("The dna string is :" + dna);
        gene = findGene(dna, 0);
        System.out.println("Gene found is :" + gene);
        
        dna= "aaaaaaATGaaaaaaaaTAGaTAATGAaaa";
        System.out.println("The dna string is :" + dna);
        gene = findGene(dna, 0);
        System.out.println("Gene found is :" + gene);
    }
}