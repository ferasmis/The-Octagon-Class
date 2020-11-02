/*******************************************************************************
* Name: Feras
* Description: Calculate area perimeter of an Octagon by extending
* the AbstractGeometricObject and implements Comparable and Clone able interface
 ******************************************************************************/

public class Octagon extends AbstractGeometricObject implements 
        Comparable<Octagon>, Cloneable{
    //private data field 
    private double side;

    //default constructor and set side value
    public Octagon(double side){
        this.side = side;
    }//end constructor

    @Override
    //calculate area 
    public double getArea(){
        return ((2.0 + 4.0 / Math.sqrt(2)) * side * side);
    }//end getArea

    @Override
    //calculate perimeter
    public double getPerimeter(){
        return 8 * side;
    }//end getPerimeter

    //compareTo method to compare contents of objs
    public int compareTo(Octagon oct){
        if ((getArea() > oct.getArea())) {
            return 1;
        } 
        else if((getArea() < oct.getArea())) {
            return -1;
        }
        else    {
            return 0;
        }
    }//compareTo method


    @Override
    //method to create an object Clone
    public  Object clone() throws CloneNotSupportedException{
       Object o = null;
        try{
            o =  super.clone();
        }
        catch (CloneNotSupportedException ex) {
        }
        return o;
    }//end clone method


    public static void main(String[] args) throws CloneNotSupportedException {
        // Create an Octagon object
        Octagon octagon1 = new Octagon(5);

        // Display area and perimeter for octagon1
        System.out.println("Octagon1 area is: " + octagon1.getArea() + 
                "\nPerimeter is: " + octagon1.getPerimeter());

        // Create new object octagon2 using the clone method
        Octagon octagon2 = (Octagon)octagon1.clone();


        // Compare the two object using compareTo method
        {//block to compare and display message
            int compared = (octagon1.compareTo(octagon2));
            switch (compared) {
                case 1:
                    compared =1;
                    break;
                case -1:
                    compared = -1;
                    break;
                default:
                    compared = 0;
                    break;
            }//end switch statment

            //display the result of if statment
            System.out.println("Compare the Octagon1 with the clone Octogon2: " 
                + compared);
        }//end block

        //create octagon3 object 
        Octagon octagon3 = new Octagon(7);

        // Display area and perimeter of octagon3
        System.out.println("Octagon3 area is: " + octagon3.getArea() + 
            "\nPerimeter is: " + octagon3.getPerimeter());

        {//block to compare and display message
            int result = (octagon1.compareTo(octagon3));
            switch (result) {
                case 1:
                    result =1;
                    break;
                case -1:
                    result = -1; 
                    break;
                default:
                    result = 0;
                    break;
            }//end switch statement

            //display the result of if statment
            System.out.println("Compare the Octagon1 with Octogon3: " + result);
        }//end block
        
    }//end main
}//end class
