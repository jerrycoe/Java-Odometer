//Need Algorithm

public class Odometer {

    private double milesDriven;
    private double fuelEfficiency;

    public void reset(){
        milesDriven = 0;
    }
    public void setFuelEfficiency(double mpg){
        if(mpg > 0)
        {
            fuelEfficiency = mpg;
        }else{
            fuelEfficiency = 0;
        }
    }
    public void addMiles(double miles){
        if(miles >= 0)
        {
            milesDriven = miles;
        }
    }
    public double getGallonsConsumed(){
        if(fuelEfficiency == 0)
        {
            return 0;
        }else{
            return milesDriven / fuelEfficiency;
        }

    }
    public String toString(){
        return milesDriven + "miles, " + fuelEfficiency + " mpg.";
    }
    
}
