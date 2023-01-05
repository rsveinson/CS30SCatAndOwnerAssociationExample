import java.util.ArrayList;

/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: Cats and Owners Association Example
 *
 ***********************************************************************/

// import libraries as needed here

public class Owner {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    private String name;
    
    // associatoin field
    ArrayList<Cat> cats;
    
    //*** Constructors ***
    
    public Owner(){
        name = "Uknown";
        
        // instantiate the collection of cats
        cats = new ArrayList<Cat>();
    }//end no-arg
    
    public Owner(String n){
        this.name = n;
        
        // instantiate the collection of cats
        cats = new ArrayList<Cat>();
    }// end full arg
   
    //*** Getters ***
    public String getName(){
        return this.name;
    }// end getname
    
    // association methods
    public ArrayList<Cat> getCats(){
        return cats;
    }// end get cats
    
    //*** Setters ***
    public void setName(String n){
        this.name = n;
    }// end set name
    
    public void setCats(ArrayList<Cat> cats){
        this.cats = cats;
    }// end set cats
    
    // add an individual cat to the list of cats owned
    // by owner
    public void addCat(Cat c){
        cats.add(c);
    }// end add cat
    
    // ** other **
    @Override
    public String toString(){
        String st = name + "'s Cats:\n";
        //st += cats;
        for(Cat c : cats){
            st += c.getName() + ", ";
        }// end for
        return st;
    }// end toSTring
    
} // end of public class

/*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
