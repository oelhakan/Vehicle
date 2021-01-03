public class CAR extends Vehicle {

    private int numberOfWheels;
    private int numberOfDoors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public CAR(String size, String name, int numberOfWheels, int numberOfDoors, int gears, boolean isManual) {
        super(size, name);
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear() changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() , Velocity : " + speed + " Direction : " + direction);
        move(speed, direction);
//        System.out.println("Car.changeVelocity() , Velocity : " + speed + " Direction : " + direction);
    }
}
