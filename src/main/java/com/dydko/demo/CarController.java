package com.dydko.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private List<Car> cars;

    public CarController() {
        Car car1 = new Car("Renault1", "Megane1");
        Car car2 = new Car("Renault2", "Megane2");
        Car car3 = new Car("Renault3", "Megane3");

        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
    }

    @GetMapping("/car")
    public String getCar(Model model) {
        model.addAttribute("cars", cars);
        model.addAttribute("newCar", new Car());
        return "car";
    }

    @PostMapping("/addcar")
    public String addCar(@ModelAttribute Car car)
    {
        cars.add(car);
        //System.out.println(car.getMarka());
        return "redirect:/car";
    }
}
