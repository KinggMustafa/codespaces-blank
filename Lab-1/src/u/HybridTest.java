import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HybridTest {

    private Hybrid hybridCar;

    @Before
    public void setUp() {
        hybridCar = new Hybrid();  
    }
//initialize hybrid object for every single test 
    
    @Test
    public void testCalcGasMPG() {
        hybridCar.setMilesfromGas(120);  //set to 120 miles driven
        hybridCar.setGallonsfromGas(6);  //number of gallons used t o 6
        double mpg = hybridCar.calcGasMPG();
        
        System.out.println("Gasoline MPG: " + mpg);

        //assert that the mpg is correct
        assertEquals(20.0, mpg, 0.01);  //first parameter is the expected mpg (20)
    }

    //MPGE calculations:
    @Test
    public void testCalcMPGe() {
        hybridCar.setElectricMiles(300);  //set to 300 miles 
        hybridCar.setTotalkWh(70);        //set 70 kWh used 
        double mpge = hybridCar.calcMPGe();
        
        
        System.out.println("Electric MPGe: " + mpge);

        
        assertEquals(144.43, mpge, 0.01);  //expected MPGe = 144.43
    }

    //eletric trip cost
    @Test
    public void testElectricCost() {
        hybridCar.setTotalkWh(33.7);  //33.7 kWh
        hybridCar.setCostPerKWh(0.24);  //set cost 
        double totalCost = hybridCar.getElectricCost();

        System.out.println("Electric trip cost: $" + totalCost);

        //aset that it is correct
        assertEquals(8.09, totalCost, 0.01);  //expected cost: $8.09
    }

    //test for gasoline trip
    @Test
    public void testGasolineCost() {
        hybridCar.setMilesfromGas(120);  //120 miles driven 
        hybridCar.setGallonsfromGas(6);  //6 gallons used
        hybridCar.setCostPerGallon(3.50);  
        double totalCost = hybridCar.getGasolineCost();

        System.out.println("Gasoline trip cost: $" + totalCost);

        assertEquals(21.0, totalCost, 0.01);  //expected cost is 21 
    }
}
