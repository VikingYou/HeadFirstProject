package example.builder;

import example.builder.builders.CarBuilder;
import example.builder.builders.CarManualBuilder;
import example.builder.cars.Car;
import example.builder.cars.Manual;
import example.builder.director.Director;

/**
 * Created by ycd20 on 2022/07/03
 */
public class Demo {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car build:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\n Car manual built :\n" + carManual.print());
    }

}
