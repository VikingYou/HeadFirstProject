package designpatterns.observe.weatherobservable;

import java.util.Observable;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 22:00
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return temperature;
    }


    public float getPressure() {
        return pressure;
    }
}
