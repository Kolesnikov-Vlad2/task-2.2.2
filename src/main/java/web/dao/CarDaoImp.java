package web.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDaoImp implements CarDao {

    @Autowired
    @Override
    public List<Car> listCars() {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "x7", 900));
        cars.add(new Car("Audi", "Q3", 500));
        cars.add(new Car("Volga", "2105", 1200));
        cars.add(new Car("Porsh", "911", 130));
        cars.add(new Car("Moskvich", "v0.1", 1450));

        return cars;
    }
}
