/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: Association, Cat and Owner example
 *
 ***********************************************************************/

// import libraries as needed here

public class Cat {
    //*** Class Variables ***
    
    private static int nextID = 1000;
    
    //*** Instance Variables ***
    
    private int age;
    private String name;
    private int id;             // unique id for each cat object
    
    // association field
    Owner owner = new Owner();
    
    //*** Constructors ***
    
    public Cat(){
        age = 0;
        name = "Uknown";
        id = getNextID();
    }// end no-arg
    
    public Cat(int age, String name){
        this.age = age;
        this.name = name;
        id = getNextID();
    }// end full arg
    
        
    //*** Getters ***
    
    public int getAge(){
        return age;
    }// end get age
    
    public String getName(){
        return name;
    }// end get name
    
    public int getID(){
        return id;
    }// end get id
    
    // ** association method
    public Owner getOwner(){
       return owner; 
    }// end get owner
    
    //*** Setters ***
    
    public void setAge(int a){
        this.age = a;
    }// end set age
    
    public void setName(String n){
        name = n;
    }// end set name
    
    // association method
    public void setOwner(Owner o){
        this.owner = o;
    }// end set owner
    
    // *** other ***
    private int getNextID(){
        return nextID++;
    }// end get next id
    
    @Override
    public String toString(){
        String st = id + ": " + name + " " + age + " " + owner.getName();
        return st;
    }// end toString
    
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
    

