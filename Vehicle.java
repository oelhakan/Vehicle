public class Vehicle {

    private int currentVelocity;
    private int currentDirection;
    private String size;
    private String name;

    public Vehicle(String size, String name) {
        this.currentVelocity = 0;
        this.currentDirection = 0;
        this.size = size;
        this.name = name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() Called , Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move() called , Moving at speed : " + currentVelocity + " in direction : " + currentDirection);
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
