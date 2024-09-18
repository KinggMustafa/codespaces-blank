public class Hybrid implements ElectricInterface, GasolineInterface {

    private double gasMPG;
    private double MpgE;
    private double miles;
    private double gallons;
    private double kWh;
//priv variables for storing vehicle attributes
    
    private double costPerGallon; //cost per gallon of gasoline
    private double costPerKWh;

    private final double MPG_E = 33.7; //constant for converting eletric consumption to gas 

    //calculate gasoline MPG
    @Override
    public double calcGasMPG() {
        return miles / gallons; //miles driven per gallon 
    }

    @Override
    public void setMilesfromGas(double miles) {
        this.miles = miles; 
    }

    @Override
    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }

    public double getGasolineCost() {
        return gallons * costPerGallon;  
    }

    public void setCostPerGallon(double costPerGallon) {
        this.costPerGallon = costPerGallon;  //cost per gallon of gas
    }

    
    @Override
    public double calcMPGe() {
        return (miles / kWh) * MPG_E; //convert miles per kwh to miles per gallon equivalent
    }

    @Override
    public void setElectricMiles(double totalElectricMiles) {
        this.miles = totalElectricMiles;
    }

    @Override
    public void setTotalkWh(double totalkWh) {
        this.kWh = totalkWh;
    }

    public double getElectricCost() {
        return kWh * costPerKWh;   //calculate cost by multiplying kwh used by the cost per kwh 
    }

    public void setCostPerKWh(double costPerKWh) {
        this.costPerKWh = costPerKWh;  //cost per kwh of eletricity
    }

    
    public double calcHybridAverageMPG() {
        return (calcGasMPG() + calcMPGe()) / 2; //average of gas mpg and mpge
    }
}
