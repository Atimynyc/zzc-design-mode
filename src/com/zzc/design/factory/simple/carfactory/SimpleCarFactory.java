package com.zzc.design.factory.simple.carfactory;

import com.zzc.design.factory.simple.car.SimpleBike;
import com.zzc.design.factory.simple.car.SimpleCar;
import com.zzc.design.factory.simple.car.SimpleMotorCycle;
import com.zzc.design.factory.simple.car.SimpleTaxi;

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
