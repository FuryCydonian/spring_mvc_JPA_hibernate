package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

//@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getSomeCars(List<Car> list, int count) {
        return count < 5 ? list.stream().limit(count).toList() : list;
    }
}
