
package relationships;

/*** @author dallas */
class Car {
    String make, model;
    int year;
    
    public void carInfo(){
        System.out.println("Make= "+ make + "      Model= " + model + "       Year= " + year);
    }
    public void setMake(String make){
        this.make = make;
    }    
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    
    }
}
    
