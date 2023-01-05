import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Association example with cats and their owners
 * 
 *************************************************************/

public class CatAndOwnerDriver {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("Cats and Owners");
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
        // ** create some cats **
        Cat cat1 = new Cat(2, "Rincewind");
        Cat cat2 = new Cat(5, "Mittens");
        
        Owner owner1 = new Owner("Odin");
        
    // ***** print banners *****
        
        System.out.println(pInfo.getBanner());
        //fout.print(banner);
    
    // ***** Get Input *****
    
    // ***** Main Processing *****
    
        // define the associations
        adoptACat(owner1, cat1);
        adoptACat(owner1, cat2);
        
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(owner1);
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
    public static void adoptACat(Owner owner, Cat cat){
        cat.setOwner(owner);
        owner.addCat(cat);
    }// end adopt a cat
    
} // end FormatTemplate
