package com.zzc.factory.simple.carfactory;

import com.zzc.factory.simple.car.SimpleBike;
import com.zzc.factory.simple.car.SimpleCar;
import com.zzc.factory.simple.car.SimpleMotorCycle;
import com.zzc.factory.simple.car.SimpleTaxi;

/**
 * 简单工厂模式
 */
public class SimpleCarFactory {

    public SimpleCar createCar(String carType) {
        if (carType.equalsIgnoreCase("bike")) {
            return new SimpleBike();
        } else if (carType.equalsIgnoreCase("motorCycle")) {
            return new SimpleMotorCycle();
        } else if (carType.equalsIgnoreCase("taxi")) {
            return new SimpleTaxi();
        }else {
            return null;
        }
    }

}
