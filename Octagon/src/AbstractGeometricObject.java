//demostarte abstract class with abstarct methods
//test the abstarct class obj

public abstract class  AbstractGeometricObject {
    //private data fields
   private String color = "white" ;
   private boolean filled; //false by default
   private java.util.Date dateCreated;
   
   //constructors
   protected AbstractGeometricObject(){
       //defauld constructor
       dateCreated = new java.util.Date(); // when the obj was created
   }// end class
  
   protected AbstractGeometricObject(String color, boolean filled){
       dateCreated = new java.util.Date(  );
       this.color = color;
       this.filled = filled;
   }//end constructor
   
   //reutrn color
   public String getColor(){
       return color;
   }
   
   //set new color
   public void setColor(String color){
       this.color = color;
   }
   
   //return filled.boolean isfilled
   public boolean isFilled(){
       return filled;
   }
   
   //set new filled
   public void setFilled(boolean filled){
       this.filled = filled;
   }
   
   //get dateCreated
   public java.util.Date getDateCreated(){
       return dateCreated;
   }
   
   //return a string that reperesents the obj
   @Override
   public String toString(){
       return "created on " + dateCreated + "\ncolor  " + color + 
               " and filled: " + filled;
   }
   
   //abstract methods
   public abstract double getArea();
   public abstract double getPerimeter();
   
}//end class



