package com.hibernatechallenge;

import java.util.HashSet;
import java.util.Set;

import com.model.Car;
import com.model.Showroom;

public class Cartest {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setCarname("Ferrari");
        c1.setColor("Red");

        Car c2 = new Car();
        c2.setCarname("Mercedes");
        c2.setColor("Black");

        Showroom showroom = new Showroom();
        showroom.setLocation("Chennai");
        showroom.setManager("Ramesh");

        Set<Car> cars = new HashSet<>();
        cars.add(c1);
        cars.add(c2);

        showroom.setCars(cars);
        c1.getShowrooms().add(showroom);
        c2.getShowrooms().add(showroom);

        ShowroomDao showroomDao = new ShowroomDao();
        showroomDao.save(showroom);
    }
}
