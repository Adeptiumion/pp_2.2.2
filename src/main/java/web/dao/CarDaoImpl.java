package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Nissan", "Blue", 300));
        cars.add(new Car("Lexus", "Orange", 1100));
        cars.add(new Car("Honda", "Red", 320));
        cars.add(new Car("Toyota", "White", 800));
        cars.add(new Car("Shoha", "Grey", 100));
    }
    @Override
    public List<Car> getCars() {
        return cars;
    }
}
