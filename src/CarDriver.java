public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.setCruise(0,80);
        myCar.setTarget(50);
        boolean asd = myCar.turnOn();
        if (asd) {
            System.out.println("Cruise control was turned on here");
        } else {
            System.out.println("Cruise control was turned off, invalid target.");
        }
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        myCar.setTarget(90);
        asd = myCar.turnOn();
        if (asd) {
            System.out.println("Cruise control was turned on here");
        } else {
            System.out.println("Cruise control was turned off, invalid target.");
        }
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");


    }
}
