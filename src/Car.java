public class Car {

    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float topSpeed;
    private float maxGas;

    private float cruiseMax;
    private float cruiseMin;
    private float cruiseTarget;
    private boolean cruiseOn;

    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }

    public Car(String typeName, float maxGas, float topSpeed) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
        this.maxGas = maxGas;
        this.topSpeed = topSpeed;
    }

    public void setCruise(float min, float max) {
        this.cruiseMax = max;
        this.cruiseMin = min;
    }

    public void setTarget(float target) {
        this.cruiseTarget = target;
    }

    public boolean turnOn() {
        if (this.cruiseTarget <= this.cruiseMax && this.cruiseTarget >= this.cruiseMin) {
            this.cruiseOn = true;
            while (this.speed < this.cruiseTarget) {
                this.accelerate();
            }
            float decel = this.speed - this.cruiseTarget;
            int x = (int) decel;
            this.decelerate(x);
            return true;
        } else {
            this.cruiseOn = false;
            return false;
        }
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }
}
