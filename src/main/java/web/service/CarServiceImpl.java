package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao){
        this.carDao = carDao;
    }
    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(Math.min(count, 5)); // Вдруг юзверь передаст больше 5-ки в count, машин то всего 5 наплодили.
    }
}
