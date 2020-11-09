import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HighwayTest {

    private Highway highway;
    private Object Vehicle;


    @Before
    public void initHighway() {
        this.highway = new Highway();
    }

    @Test
    public void testGetTaxWhenCarAddedThenTaxIsPositive() {
        Car car = new Car("asd", 200);
        highway.addNewVehicle(car);
        double expected = 40;

        Assert.assertEquals("Tax should be correct", expected, highway.getTaxGathered(), 0.0001);
    }

    @Test
    public  void  testGetTaxWhenMotorbikeAddedThenTaxIsPositive() {
        Motorbike motorbike = new Motorbike("1234",100);
        highway.addNewVehicle(motorbike);
        double expected = 10;

        Assert.assertEquals("Tax should be correct", expected, highway.getTaxGathered(), 0.0001);
    }

    @Test
    public void testNumberOfVehicleWhenAddNewThenPlusOne() {
        Car car = new Car ("1256",100);
        highway.addNewVehicle(car);
        Car car1 = new Car("1335", 160);
        highway.addNewVehicle(car1);
        double expected = 2;

        Assert.assertEquals("Cars should be two",highway.getNumberOfVehicles(), expected, 0.001);
    }

    @Test
    public void testRemoveVehicleWhenAddedAndPaidThenRemoved() {
        Car car = new Car("5525", 200);
        highway.removeVehicle(car);
        double expected = 0;

        Assert.assertEquals("There is a car", expected, highway.getNumberOfVehicles(), 0.001 );
    }

    @Test
    public void testRemoveMotorbikeWhenAddedAndPaidThenRemoved() {
        Motorbike motorbike = new Motorbike("5525", 100);
        highway.removeVehicle(motorbike);
        double expected = 0;

        Assert.assertEquals("There is still motorbike", expected, highway.getNumberOfVehicles(), 0.001 );
    }
}
