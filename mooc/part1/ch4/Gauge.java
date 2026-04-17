package mooc.part1.ch4;

public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (value < 5)
            this.value++;
    }

    public void decrease() {
        if (value > 0)
            this.value--;
    }

    public int value() {
        return value;
    }

    public boolean full() {
        return value == 5;
    }
}
