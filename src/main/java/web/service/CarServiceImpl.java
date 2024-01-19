package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsList(int number) {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("Red", "Mazda", 5));
        allCars.add(new Car("Blue", "Audi", 15));
        allCars.add(new Car("White", "Mercedes-Benz", 500));
        allCars.add(new Car("Black", "BMW", 3));
        allCars.add(new Car("Green", "Renault", 311));
        return allCars.stream().limit(number).collect(Collectors.toList());
    }
}
