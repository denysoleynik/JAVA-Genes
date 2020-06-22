
/**
 * Write a description of class Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
public boolean twoOccurrences(String stringa, String stringb) {
    int index = stringb.indexOf(stringa);
    
    if (stringb.indexOf(stringa)== -1) {
        return false;
    }
    if (stringb.indexOf(stringa, index+1) == -1) {
    return false;
}
return true;
}

public String lastPart(String stringa, String stringb) {
    int index = stringb.indexOf(stringa);
    int length = stringa.length();
    if (index == -1) {
        return stringb;
    }
    String result = stringb.substring(index+length);
    return result;
}

public void testing() {
    String stringa = "aa";
    String stringb = "olgaadenis";
    System.out.println(lastPart(stringa, stringb));

    stringa = "bb";
    stringb = "olgaadenis";
    System.out.println(lastPart(stringa, stringb));
}
}