
/**
 * Write a description of class Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Part2 {
    public String findSimpleGene (String dna, int startCodon, int stopCodon) {
    String Udna = dna.toUpperCase();
    String result = "";
    int startIndex = Udna.indexOf("ATG");
    int startIndexL = dna.indexOf("atg");
    if (startIndex == -1 && startIndexL == -1) {
        return  "no ATG";
    }
    int stopIndex = Udna.indexOf("TAA", startIndex+3);
    if (stopIndex == -1) {
        return  "No ATG or Both";
    }
    result = Udna.substring(startIndex, stopIndex+3);
    if ((result.length() %3) == 0) {
        if (startIndexL == -1) {
        return result;
        }
    result = result.toLowerCase();
    return result;
}
    return "Not a Gene";
}
              
public String findSimpleGeneL(String dna, int startCodon, int stopCodon) {
    String result = "";
    int startIndexL = dna.indexOf("atg");
    if (startIndexL == -1) {
        return  "no atg";
    }
    int stopIndexL = dna.indexOf("taa", startIndexL+3);
    if (stopIndexL == -1) {
        return  "no taa";
    }
    result = dna.substring(startIndexL, stopIndexL+3);
    if ((result.length() %3) == 0) {
        return result;
    }
    return "No Genes";
}

public void testSimpleGene() {
    String dna = "AATGCCGTAATATGGT";
    int startCodon = 0;
    int stopCodon = 0;
    System.out.println("DNA is " + dna);
    String gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "AATGCGTAATATGGT";
    startCodon = 0;
    stopCodon = 0;
    System.out.println("DNA is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "AATTCCGTAATATGGT";
    startCodon = 0;
    stopCodon = 0;
    System.out.println("DNA is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "AATTCCGTATTATGGT";
    startCodon = 0;
    stopCodon = 0;
    System.out.println("DNA is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "aatgccgtaatatggt";
    startCodon = 0;
    stopCodon = 0;
    System.out.println("DNA is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "atgcctaatatggt";
    startCodon = 0;
    stopCodon = 0;
    System.out.println("DNA is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "ccgtaatatggt";
    startCodon = 0;
    stopCodon = 0;
    System.out.println("DNA is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "atgccgtatggt";
    startCodon = 0;
    stopCodon = 0;
    System.out.println("DNA is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
}
}


