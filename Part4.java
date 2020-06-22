
/**
 * Write a description of class Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class Part4 {
public void findLinks() {
    URLResource webpage = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
    for (String pages : webpage.words()) {
    String pagesL = pages.toLowerCase();
    if (pagesL.contains("youtube.com")) {
        //int startIndex = pagesL.indexOf("\"");
        //int stopIndex = pagesL.lastIndexOf("\"");
        //String link = pages.substring(startIndex+1, stopIndex);
        System.out.println(pagesL);
    }
}
}
}
