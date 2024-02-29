package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoImpl;

@Controller
public class CarController {
    private final CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "6") int count, Model model) {
        model.addAttribute("cars",carDao.getCar(count));
        return "cars";
    }
}