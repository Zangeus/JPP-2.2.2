package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void addCar();
    List<Car> listCars();
    List<Car> getCars(int count);
}
