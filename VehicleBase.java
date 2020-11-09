public abstract class VehicleBase implements Vehicle {

    private  final  String registrationNumber;
    private final int horsepower;
    protected int speed;

    public VehicleBase(String registrationNumber, int horsepower, int speed) {
        this.registrationNumber = registrationNumber;
        this.horsepower = horsepower;
        this.speed = 10;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public int increaseSpeed(int kph) {
        return this.speed -= kph;
    }

    @Override
    public int decreaseSpeed(int kph) {
        return this.speed += kph;
    }
}
