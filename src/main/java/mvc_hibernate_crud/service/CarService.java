package mvc_hibernate_crud.service;

import mvc_hibernate_crud.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getSomeCars(List<Car> list, int count);
}
