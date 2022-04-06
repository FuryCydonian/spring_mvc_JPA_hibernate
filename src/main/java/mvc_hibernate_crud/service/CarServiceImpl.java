package mvc_hibernate_crud.service;

import mvc_hibernate_crud.model.Car;

import java.util.List;

//@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getSomeCars(List<Car> list, int count) {
        return count < 5 ? list.stream().limit(count).toList() : list;
    }
}
