import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void testDoesItMoveWhenCarIsStartedThenSpeedIsNotZero() {
        Car car = new Car("AS1234AS", 200);
        car.start();

        Assert.assertTrue("Car should be moving", car.doesItMove());
    }

    @Test
    public void testDoesItMoveWhenCarIsCreatedThenSpeedIsZero() {
        Car car = new Car("AS1234AS", 200);

        Assert.assertTrue("Car should be still", car.doesItMove());
    }

    @Test
    public void testDoesItMoveWhenCarIsStoppedThenSpeedIsZero() {
        Car car = new Car("AS1234AS", 200);
        car.start();
        car.stop();

        Assert.assertFalse("Car should be not moving when stopped", car.doesItMove());
    }

    @Test
    public void testGetTaxedWhenIsCarThenZeroPointTwo() {
        Car car = new Car("1234", 200);
        double expected = 40;
        Assert.assertEquals("This is not correct Tax", expected, car.getTax(), 0.0001 );
    }
}
