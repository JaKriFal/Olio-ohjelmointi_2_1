public class CoffeeMaker {

    private boolean isOn;
    private float coffeeAmount;

    private boolean isEspresso;

    public CoffeeMaker() {
        this.isOn = false;
        this.coffeeAmount = 10;
        this.isEspresso = false;

    }

    public void onOff() {
        if (this.isOn) {
            this.isOn = false;
        } else {
            this.isOn = true;
        }
    }
    public void status() {
        if (this.isOn) {
            System.out.print("Coffeemaker is on, amount is " + this.coffeeAmount + ", ");
            if (this.isEspresso) {
                System.out.println("type is espresso.");
            } else {
                System.out.println("type is regular.");

            }
        } else {
            System.out.println("Coffeemaker is off");
        }
    }

    public void switchType() {
        if (this.isOn) {
            this.isEspresso = !this.isEspresso;
        }
    }

    public void setAmount(float amount) {
        if (this.isOn) {
            if (amount <= 80 && amount >= 10) {
                this.coffeeAmount = amount;
            } else if (amount < 10) {
                this.coffeeAmount = 10;
            } else {
                this.coffeeAmount = 80;
            }
        }

    }

    public static void main(String[] args) {
        //testailuja
        CoffeeMaker kaffe = new CoffeeMaker();
        kaffe.status();
        kaffe.onOff();
        kaffe.status();
        kaffe.switchType();
        kaffe.setAmount(50);
        kaffe.status();
        kaffe.onOff();
        kaffe.switchType();
        //ei muutu koska kahvinkeitin pois päältä
        kaffe.setAmount(30);
        kaffe.onOff();
        kaffe.status();


    }
}
