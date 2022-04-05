package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarService carService = new CarServiceImpl();
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "X5", 1234));
        carList.add(new Car("Hyundai", "Sonata", 2345));
        carList.add(new Car("Kia", "Rio", 3456));
        carList.add(new Car("Hyundai", "Solaris", 4567));
        carList.add(new Car("Renault", "Logan", 5678));
        List<Car> returnedCarList = count == null ? carList : carService.getSomeCars(carList, count);

        model.addAttribute("list", returnedCarList);
        return "cars";
    }

//    @GetMapping("/cars")
//    public String getCars() {
//        return "cars";
//    }
}
