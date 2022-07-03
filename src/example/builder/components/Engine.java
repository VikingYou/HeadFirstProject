package example.builder.components;

import java.math.BigDecimal;

/**
 * Created by ycd20 on 2022/07/03
 */
public class Engine {
    private final double volume;

    private double mileage;

    private boolean started;

    public Engine(double volume, double mileage) {
        this.mileage = mileage;
        this.volume = volume;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Can not go(),you must start engine first");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
