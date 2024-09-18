public class CarRunner {

    public static void main(String[] args) {
        HybridVehicle hybridCar = new HybridVehicle();

        hybridCar.setCostPerGallon(3.50); //cost for gasoline per gallon
        hybridCar.setCostPerKWh(0.24); //cost for electricity

        hybridCar.setMilesfromGas(120);  //set the miles driven on gas
        hybridCar.setGallonsfromGas(6);
        double gasMPG = hybridCar.calcGasMPG();  //calculate miles per gallon
        double gasCost = 6 * hybridCar.getCostPerGallon();
        System.out.println("Gasoline mode MPG: " + gasMPG);
        System.out.println("Cost of gasoline trip: $" + gasCost);

        //eletric vehicle
        hybridCar.setElectricMiles(300);//miles driven
        hybridCar.setTotalkWh(70);//kwh used
        double mpge = hybridCar.calcMPGe();  //calculate miles per gallon (eletric)
        double electricCost = 70 * hybridCar.getCostPerKWh();
        System.out.println("Electric mode MPGe: " + mpge);
        System.out.println("Cost of electric trip: $" + electricCost);

        //hybrid which uses both gas and Kw
        double hybridAverageMPG = hybridCar.calcHybridAverageMPG();
        System.out.println("Hybrid mode average MPG: " + hybridAverageMPG);
    }
}
