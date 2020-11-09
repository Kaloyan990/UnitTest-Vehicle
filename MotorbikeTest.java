import org.junit.Assert;
import org.junit.Test;

public class MotorbikeTest {
    @Test
    public void testDoesItMoveWhenMotorbikeIsStartedThenSpeedIsNotZero() {
        Motorbike motorbike = new Motorbike("1234", 100);
        motorbike.start();

        Assert.assertTrue("Motorbike should be moving", motorbike.doesItMove());
    }

    @Test
    public void testDoesItMoveWhenMotorbikeIsCreatedThenSpeedIsZero() {
        Motorbike motorbike = new Motorbike("1234", 100);

        Assert.assertTrue("Motorbike should be still", motorbike.doesItMove());
    }

    @Test
    public void testDoesItMoveWhenMotorbikeIsStoppedThenSpeedIsZero() {
        Motorbike motorbike = new Motorbike("1234", 100);
        motorbike.start();
        motorbike.stop();

        Assert.assertFalse("Motorbike should be not moving when stopped", motorbike.doesItMove());
    }

    @Test
    public void testGetTaxedWhenIsMotorbikeThenZeroPointOne() {
        Motorbike motorbike = new Motorbike("1234", 100);
        double expected = 10;
        Assert.assertEquals("This is not correct Tax", expected, motorbike.getTax(), 0.0001 );
    }
}
