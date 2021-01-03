public class Camaro extends CAR {
    private int numberOfServiceMonths;

    public Camaro(int numberOfServiceMonths) {
        super("RearWheelDrive", "Camaro", 4, 3, 8, false);
        this.numberOfServiceMonths = numberOfServiceMonths;
    }

    public void accelerate(int rate){       //rate is the difference of speed from the current speed
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity>0 && newVelocity<=30){
            changeGear(1);
        }else if(newVelocity>30 && newVelocity<=60){
            changeGear(2);
        }else if(newVelocity>60 && newVelocity<=90){
            changeGear(3);
        }else if(newVelocity>90 && newVelocity<=120){
            changeGear(4);
        }else if(newVelocity>120 && newVelocity<=150){
            changeGear(5);
        }else if(newVelocity>150 && newVelocity<=180){
            changeGear(6);
        }else if(newVelocity>180 && newVelocity<=210){
            changeGear(7);
        }else if(newVelocity>210 && newVelocity<=240){
            changeGear(8);
        }

        if(newVelocity>0){
            changeVelocity(newVelocity , getCurrentDirection());
        }
    }
}
