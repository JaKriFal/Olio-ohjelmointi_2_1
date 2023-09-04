public class Television {

    private int channel;
    private int day;

    public Television() {
        this.channel = 1;
        this.day = 1;
    }

    public void Off() {
        System.out.println("Falling asleep");
        this.day++;
    }

    public void On() {
        System.out.println("Woke up, day " + this.day);
    }

    public void Watch() {
        System.out.println("Watching channel " + this.channel);
        if (this.channel == 10) {
            this.channel = 1;
        } else {
            this.channel++;
        }
    }

}
