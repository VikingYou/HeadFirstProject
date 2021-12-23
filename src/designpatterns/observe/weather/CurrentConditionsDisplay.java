package designpatterns.observe.weather;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 21:47
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserve(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions :" + temperature + "F degree and" + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
