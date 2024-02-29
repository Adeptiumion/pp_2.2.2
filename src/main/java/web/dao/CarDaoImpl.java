package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Nissan", "Blue", 300));
        cars.add(new Car("Lexus", "Orange", 1100));
        cars.add(new Car("Mitsubishi", "Black", 900));
        cars.add(new Car("Honda", "Red", 320));
        cars.add(new Car("Toyota", "White", 800));
        cars.add(new Car("Shoha", "Grey", 100));
    }


    public int getSizeOfCarsList(){
        return cars.size();
    }

    @Override
    public List<Car> getCar(int count) {
        return count >= 5 ? cars.stream().toList() : cars.stream().limit(count).toList();
    }
}
