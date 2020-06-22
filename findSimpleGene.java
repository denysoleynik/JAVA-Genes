
/**
 * Write a description of class Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class findSimpleGene {
    public String findSimpleGene (String dna) {
    String result = "";
    int startIndex = dna.indexOf("ATG");
    if (startIndex == -1) {
        return  "";
    }
    int stopIndex = dna.indexOf("TAA", startIndex+3);
    if (stopIndex == -1) {
        return  "";
    }
    result = dna.substring(startIndex, stopIndex+3);
    if ((result.length() %3) == 0) {
        return result;
    }
    return "Not a Gene";
}

public void testSimpleGene() {
    String dna = "AATGCCGTAATATGGT";
    System.out.println("DNA is " + dna);
    String gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "AATGCGTAATATGGT";
    System.out.println("DNA is " + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "AATTCCGTAATATGGT";
    System.out.println("DNA is " + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "AATTCCGTATTATGGT";
    System.out.println("DNA is " + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
}
}
    
    
    

