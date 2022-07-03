package example.builder.builders;

import example.builder.cars.CarType;
import example.builder.components.Engine;
import example.builder.components.GPSNavigator;
import example.builder.components.Transmission;
import example.builder.components.TripComputer;

/**
 * Created by ycd20 on 2022/07/03
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);

}
