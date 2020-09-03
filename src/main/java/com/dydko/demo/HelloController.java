package com.dydko.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    private List<Car> cars;

    public HelloController(List<Car> cars) {
        Car car1 = new Car("Renault1", "Megane1");
        Car car2 = new Car("Renault2", "Megane2");
        Car car3 = new Car("Renault3", "Megane3");

        this.cars = Arrays.asList(car1, car2, car3);
    }

    @GetMapping("/hello")
    public String get(Model model) {

        model.addAttribute("cars", cars);
        return "hello";
    }
}
